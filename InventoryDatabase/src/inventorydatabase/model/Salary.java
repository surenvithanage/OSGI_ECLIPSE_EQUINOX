package inventorydatabase.model;

public class Salary {
	String id;
	String empId;
	String empName;
	String empNIC;
	String basicSalary;
	String epf;
	String netSalary;

	public Salary(String id, String empId, String empName, String empNIC, String basicSalary, String epf,
			String netSalary) {
		super();
		this.id = id;
		this.empId = empId;
		this.empName = empName;
		this.empNIC = empNIC;
		this.basicSalary = basicSalary;
		this.epf = epf;
		this.netSalary = netSalary;
	}

	public Salary() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpNIC() {
		return empNIC;
	}

	public void setEmpNIC(String empNIC) {
		this.empNIC = empNIC;
	}

	public String getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(String basicSalary) {
		this.basicSalary = basicSalary;
	}

	public String getEpf() {
		return epf;
	}

	public void setEpf(String epf) {
		this.epf = epf;
	}

	public String getNetSalary() {
		return netSalary;
	}

	public void setNetSalary(String netSalary) {
		this.netSalary = netSalary;
	}

}
