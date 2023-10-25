package bus;
import java.io.Serializable;

public abstract class Employee implements IPayable, Serializable{

	private static final long serialVersionUID = -5791444125344024530L;
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	private EnumType type;
	
	public Employee() {
		this.firstName = "Undefined";
		this.lastName = "Undefined";
		this.socialSecurityNumber = "Undefined";
		this.type = EnumType.Undefined;
	}

	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.type = EnumType.Undefined;
	}
	
	public Employee(String firstName, String lastName, String socialSecurityNumber, EnumType type) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
		this.type = type;
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

	public EnumType getType() {
		return this.type;
	}

	public void setType(EnumType type) {
		this.type = type;
	}
	
//	@Override
//	public String toString() {
//		return "Employee [firstName = " + firstName + ", lastName = " + lastName + ", socialSecurityNumber = "
//				+ socialSecurityNumber + "]";
//	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", socialSecurityNumber="
				+ socialSecurityNumber + ", type=" + type + "]";
	}

	public abstract double calcPayment();	
	
}
