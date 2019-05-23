package inventorydatabase.model;

public class Employee {
	private String id;
	private String firstname;
	private String lastname;
	private String basicSalary;
	private String NIC;

	public Employee(String id, String firstname, String lastname, String basicSalary, String nIC) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.basicSalary = basicSalary;
		NIC = nIC;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getNIC() {
		return NIC;
	}

	public void setNIC(String nIC) {
		NIC = nIC;
	}

}
