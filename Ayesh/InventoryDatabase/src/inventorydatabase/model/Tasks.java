package inventorydatabase.model;

public class Tasks {
	private String id;
	private String taskcode;
	private String description;

	public Tasks(String id, String taskcode, String description) {
		super();
		this.id = id;
		this.taskcode = taskcode;
		this.description = description;
	}

	public Tasks() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTaskcode() {
		return taskcode;
	}

	public void setTaskcode(String taskcode) {
		this.taskcode = taskcode;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Tasks [id=" + id + ", taskcode=" + taskcode + ", description=" + description + "]";
	}

}
