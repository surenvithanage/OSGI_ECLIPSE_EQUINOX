package inventorydatabase.model;

public class Suppliers {
	private String id;
	private String firstname;
	private String lastname;
	private String contactno;
	private String email;
	private String address;

	public Suppliers(String id, String firstname, String lastname, String contactno, String email, String address) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.contactno = contactno;
		this.email = email;
		this.address = address;
	}

	public Suppliers() {
		// TODO Auto-generated constructor stub
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

	public String getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno = contactno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Suppliers [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", contactno="
				+ contactno + ", email=" + email + ", address=" + address + "]";
	}

}
