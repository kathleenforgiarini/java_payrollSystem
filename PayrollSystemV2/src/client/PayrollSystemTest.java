package client;
import java.io.IOException;
import java.util.Scanner; 
import java.util.ArrayList;
import bus.*;

public class PayrollSystemTest {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<IPayable> listFromConsole = new ArrayList<IPayable>();
		ArrayList<IPayable> listFromFile = new ArrayList<IPayable>();
		
		ArrayList<SalariedEmployee> listOfSalariedEmployee = new ArrayList<SalariedEmployee>();
		ArrayList<HourlyEmployee> listOfHourlyEmployee = new ArrayList<HourlyEmployee>();
		ArrayList<ComissionEmployee> listOfComissionEmployee = new ArrayList<ComissionEmployee>();
		ArrayList<BasePlusComissionEmployee> listOfBasePlusComissionEmployee = new ArrayList<BasePlusComissionEmployee>();

		IPayable salariedEmployee, hourlyEmployee, comissionEmployee, basePlusComissionEmployee;
		
		IPayable salariedEmployee1 = new SalariedEmployee("John", "Smith", "123456", 800);
		listFromConsole.add(salariedEmployee1);
		
		IPayable hourlyEmployee1 = new HourlyEmployee("Mike", "Scott", "123456abc", 25, 44);
		listFromConsole.add(hourlyEmployee1);
		
		IPayable comissionEmployee1 = new ComissionEmployee("Steve", "Johnson", "123 abc", 2000, 0.1);
		listFromConsole.add(comissionEmployee1);
		
		IPayable basePlusComissionEmployee1 = new BasePlusComissionEmployee("Steve", "Johnson", "123 abc", 10000, 0.08, 500);
		listFromConsole.add(basePlusComissionEmployee1);
		
		
		Scanner scan = new Scanner(System.in);
		String fn, ln, ssn, addEmp;
		EnumType type;	
		int option;
		double weeklySal = 0.00, hourlyWage = 0.00, hoursWorked = 0.00, grossSales = 0.00, comissionRate = 0.00, baseSalary = 0.00;
		
		
		do {			
			System.out.print("First name: ");
			fn = scan.next();
			System.out.print("Last name: ");
			ln = scan.next();
			System.out.print("SSN: ");
			ssn = scan.next();
			
			do {
				System.out.println("Employee type: [1] - Salaried Employee | [2] - Hourly Employee | [3] - Comission Employee | [4] - Base Plus Comission Employee");
				System.out.print("Choose your option: ");
				option = scan.nextInt();
				
				switch (option) {
				case 1:
					type = EnumType.SalariedEmployee;
					System.out.println("Please enter the weekly salary");
					weeklySal = scan.nextDouble();
					
					salariedEmployee = new SalariedEmployee(fn, ln, ssn, type, weeklySal);
					listFromConsole.add(salariedEmployee);
					break;
					
				case 2:
					type = EnumType.HourlyEmployee;
					System.out.println("Please enter the hourly wage");
					hourlyWage = scan.nextDouble();
					System.out.println("Please enter the hours worked");
					hoursWorked = scan.nextDouble();
					
					hourlyEmployee = new HourlyEmployee(fn, ln, ssn, type, hourlyWage, hoursWorked);
					listFromConsole.add(hourlyEmployee);
					break;
					
				case 3:
					type = EnumType.ComissionEmployee;
					System.out.println("Please enter the gross sales");
					grossSales = scan.nextDouble();
					System.out.println("Please enter the comission rate");
					comissionRate = scan.nextDouble();
					
					comissionEmployee = new ComissionEmployee(fn, ln, ssn, type, grossSales, comissionRate);
					listFromConsole.add(comissionEmployee);
					break;
					
				case 4:
					type = EnumType.BasePlusEmployee;
					System.out.println("Please enter the gross sales");
					grossSales = scan.nextDouble();
					System.out.println("Please enter the comission rate");
					comissionRate = scan.nextDouble();
					System.out.println("Please enter the base salary");
					baseSalary = scan.nextDouble();
					
					basePlusComissionEmployee = new BasePlusComissionEmployee(fn, ln, ssn, type, grossSales, comissionRate, baseSalary);
					listFromConsole.add(basePlusComissionEmployee);
					break;
					
				default:
					System.out.println("Wrong input, try again!");
				}
			} while (option != 1 && option != 2 && option != 3 && option != 4);
			
			
			System.out.println("Do you want to enter another employee? (Y / N)");
			addEmp = scan.next();
			
		} while(addEmp.equals("Y") || addEmp.equals("y"));
		
		
		/* Write into/Read from Serialized file */
		FileManager.serialize(listFromConsole);
		listFromFile = FileManager.deserialize();
		
		for (IPayable item : listFromFile) {
			if (item instanceof SalariedEmployee) {
				listOfSalariedEmployee.add((SalariedEmployee)item);
			}
			else if (item instanceof HourlyEmployee) {
				listOfHourlyEmployee.add((HourlyEmployee)item);
			}
			else if (item instanceof BasePlusComissionEmployee) {
				listOfBasePlusComissionEmployee.add((BasePlusComissionEmployee)item);
			}
			else if (item instanceof ComissionEmployee) {
				listOfComissionEmployee.add((ComissionEmployee)item);
			}
			
		}
		
		System.out.println("----------- List of IPayables -----------\n");

		System.out.println("----------- List of employees from console -----------\n");
		for(IPayable item : listFromConsole) {
			System.out.println(item.toString());
		}
		System.out.println("\n----------- List of employees from file -----------\n");
		for(IPayable item : listFromFile) {
			System.out.println(item.toString());
		}
		
		System.out.println("\n\n");

		System.out.println("\nList of salaried employees\n");
		for(SalariedEmployee item : listOfSalariedEmployee) {
			System.out.println(item.toString());
			System.out.println("Payment = " + item.calcPayment());
		}
		
		System.out.println("\nList of hourly employees\n");
		for(HourlyEmployee item : listOfHourlyEmployee) {
			System.out.println(item.toString());
			System.out.println("Payment = " + item.calcPayment());
		}
		
		System.out.println("\nList of commission employees\n");
		for(ComissionEmployee item : listOfComissionEmployee) {
			System.out.println(item.toString());
			System.out.println("Payment = " + item.calcPayment());
		}
		
		System.out.println("\nList of base plus commission employees\n");
		for(BasePlusComissionEmployee item : listOfBasePlusComissionEmployee) {
			System.out.println(item.toString());
			System.out.println("Payment = " + item.calcPayment());
		}
		
		System.exit(0);
		
	}

}