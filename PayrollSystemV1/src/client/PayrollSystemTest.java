package client;
import java.util.ArrayList;
import bus.*;

public class PayrollSystemTest {

	public static void main(String[] args) {
		
		ArrayList<Employee> listOfEmployees = new ArrayList<Employee>();
		
		ArrayList<SalariedEmployee> listOfSalariedEmployee = new ArrayList<SalariedEmployee>();
		ArrayList<HourlyEmployee> listOfHourlyEmployee = new ArrayList<HourlyEmployee>();
		ArrayList<ComissionEmployee> listOfComissionEmployee = new ArrayList<ComissionEmployee>();
		ArrayList<BasePlusComissionEmployee> listOfBasePlusComissionEmployee = new ArrayList<BasePlusComissionEmployee>();
		
		Employee salariedEmployee1 = new SalariedEmployee("John", "Smith", "123456", 800);
		listOfEmployees.add(salariedEmployee1);
		
		Employee hourlyEmployee1 = new HourlyEmployee("Mike", "Scott", "123456abc", 25, 44);
		listOfEmployees.add(hourlyEmployee1);
		
		Employee comissionEmployee1 = new ComissionEmployee("Steve", "Johnson", "123 abc", 2000, 0.1);
		listOfEmployees.add(comissionEmployee1);
		
		Employee basePlusComissionEmployee1 = new BasePlusComissionEmployee("Steve", "Johnson", "123 abc", 10000, 0.08, 500);
		listOfEmployees.add(basePlusComissionEmployee1);
		
		System.out.println("List of employees");
		for(Employee item : listOfEmployees) {
			System.out.println(item.toString());
		}
		
		for (Employee item : listOfEmployees) {
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

/*
List of employees
SalariedEmployee [Employee [firstName = John, lastName = Smith, socialSecurityNumber = 123456], 800.0]
HourlyEmployee [Employee [firstName = Mike, lastName = Scott, socialSecurityNumber = 123456abc], hourlyWage = 25.0, hoursWorked = 44.0]
ComissionEmployee [Employee [firstName = Steve, lastName = Johnson, socialSecurityNumber = 123 abc], grossSales = 2000.0, comissionRate = 0.1]
BasePlusComissionEmployee [ComissionEmployee [Employee [firstName = Steve, lastName = Johnson, socialSecurityNumber = 123 abc], grossSales = 10000.0, comissionRate = 0.08], baseSalary = 500.0]

List of salaried employees

SalariedEmployee [Employee [firstName = John, lastName = Smith, socialSecurityNumber = 123456], 800.0]
Payment = 800.0

List of hourly employees

HourlyEmployee [Employee [firstName = Mike, lastName = Scott, socialSecurityNumber = 123456abc], hourlyWage = 25.0, hoursWorked = 44.0]
Payment = 1150.0

List of commission employees

ComissionEmployee [Employee [firstName = Steve, lastName = Johnson, socialSecurityNumber = 123 abc], grossSales = 2000.0, comissionRate = 0.1]
Payment = 200.0

List of base plus commission employees

BasePlusComissionEmployee [ComissionEmployee [Employee [firstName = Steve, lastName = Johnson, socialSecurityNumber = 123 abc], grossSales = 10000.0, comissionRate = 0.08], baseSalary = 500.0]
Payment = 1300.0

*/
