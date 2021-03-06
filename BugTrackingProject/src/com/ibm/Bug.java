package com.ibm;

public class Bug {
	private int id;
	private String name;
	private String projectName;
	private String location;
	private String type;
	private STATUS status;
	private PRIORITY priority;

	public Bug(int id, String name, String projectName, String location, String type, STATUS status,
			PRIORITY priority) {
		this.id = id;
		this.name = name;
		this.projectName = projectName;
		this.location = location;
		this.type = type;
		this.status = status;
		this.priority = priority;
	}

	void newBug() {
		System.out.println("logged new bug");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public PRIORITY getPriority() {
		return priority;
	}

	public void setPriority(PRIORITY priority) {
		this.priority = priority;
	}

}
