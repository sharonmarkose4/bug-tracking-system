package com.ibm;

public class Manager extends Employee {
	public Manager(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	void assign(Bug bug) {
		bug.setStatus(STATUS.ASSIGNED);
		System.out.println("assigned bug to developer, status: " + bug.getStatus());
	}

	void acknowledgeReport() {
		System.out.println("acknowledged report");
	}

}
