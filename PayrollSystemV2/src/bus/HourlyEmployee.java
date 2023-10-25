package bus;

public class HourlyEmployee extends Employee{

	private static final long serialVersionUID = 6524066191747970750L;
	private double hourlyWage;
	private double hoursWorked;
	
	public HourlyEmployee() {
		super();
	}
	
	public HourlyEmployee(String fn, String ln, String ssn, double hourlyWage, double hoursWorked) {
		super(fn, ln, ssn);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}
	
	public HourlyEmployee(String fn, String ln, String ssn, EnumType type, double hourlyWage, double hoursWorked) {
		super(fn, ln, ssn, type);
		this.hourlyWage = hourlyWage;
		this.hoursWorked = hoursWorked;
	}
	
	
	public double getHourlyWage() {
		return this.hourlyWage;
	}

	public void setHourlyWage(double hourlyWage) {
		this.hourlyWage = hourlyWage;
	}

	public double getHoursWorked() {
		return this.hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	@Override
	public String toString() {
		return "HourlyEmployee [" + super.toString() + ", hourlyWage = " + hourlyWage + ", hoursWorked = " + hoursWorked + "]";
	}

	@Override
	public double calcPayment() {
		if (this.hoursWorked <= 40) 
			return this.hourlyWage * this.hoursWorked;
		else 
			return 40 * this.hourlyWage + (this.hoursWorked - 40) * this.hourlyWage * 1.5;
	}
	
	
}
