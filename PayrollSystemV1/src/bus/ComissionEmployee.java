package bus;

public class ComissionEmployee extends Employee{

	private double grossSales;
	private double comissionRate;
	
	public ComissionEmployee() {
		super();
	}

	public ComissionEmployee(String fn, String ln, String ssn, double grossSales, double comissionRate) {
		super(fn, ln, ssn);
		this.grossSales = grossSales;
		this.comissionRate = comissionRate;
	}

	public double getGrossSales() {
		return this.grossSales;
	}

	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}

	public double getComissionRate() {
		return this.comissionRate;
	}

	public void setComissionRate(double comissionRate) {
		this.comissionRate = comissionRate;
	}

	@Override
	public String toString() {
		return "ComissionEmployee [" + super.toString() + " - " + grossSales + ", comissionRate=" + comissionRate + "]";
	}

	@Override
	public double calcPayment() {
		return this.comissionRate * this.grossSales;
	}

}
