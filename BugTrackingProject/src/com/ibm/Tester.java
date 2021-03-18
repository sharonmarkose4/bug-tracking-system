package com.ibm;

public class Tester extends Employee {
	public Tester(String name, int id) {
		super(name, id);
		// TODO Auto-generated constructor stub
	}

	void analyseBug(Bug bug) {
		System.out.println(" tester analyse bug...");// Tester analyze bugs
		setStatusBug(bug);// sets status after analyzing
	}

	void setStatusBug(Bug bug) {
		bug.setStatus(STATUS.PENDING_RETEST);
		System.out.println("status set: " + bug.getStatus());
		bug.setStatus(STATUS.VERIFIED);
		System.out.println("status set: " + bug.getStatus());
		bug.setStatus(STATUS.CLOSED);
		System.out.println("status set: " + bug.getStatus());
	}

	void BugReport() {
		System.out.println("bug reported");
	}

}
