package bus;

public class BasePlusComissionEmployee extends ComissionEmployee {

	private static final long serialVersionUID = -3750755882414524068L;
	private double baseSalary;

	public BasePlusComissionEmployee() {
		super();
	}

	public BasePlusComissionEmployee(String fn, String ln, String ssn, double gSales, double cRate, double baseSalary) {
		super(fn, ln, ssn, gSales, cRate);
		this.baseSalary = baseSalary;
	}
	
	public BasePlusComissionEmployee(String fn, String ln, String ssn, EnumType type, double gSales, double cRate, double baseSalary) {
		super(fn, ln, ssn, type, gSales, cRate);
		this.baseSalary = baseSalary;
	}

	public double getBaseSalary() {
		return this.baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "BasePlusComissionEmployee [" + super.toString() + ", baseSalary = " + baseSalary + "]";
	}
	
	@Override
	public double calcPayment() {
		return super.calcPayment() + this.baseSalary;
	}

	
}
