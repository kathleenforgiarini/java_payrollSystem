package bus;

public abstract class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	public Employee() {
		super();
		this.firstName = "Undefined";
		this.lastName = "Undefined";
		this.socialSecurityNumber = "Undefined";
	}

	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocialSecurityNumber() {
		return this.socialSecurityNumber;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	@Override
	public String toString() {
		return "Employee [firstName = " + firstName + ", lastName = " + lastName + ", socialSecurityNumber = "
				+ socialSecurityNumber + "]";
	}
	
//	public double calcPayment() {
//		return 0.00 ;
//	}
	
	public abstract double calcPayment();	
	
}
