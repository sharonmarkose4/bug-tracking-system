package com.ibm;

public class Developer extends Employee {
	public Developer(String name, int id) {
		super(name, id);
	}

	void analyseBug(Bug bug) {
		System.out.println("developer analyse bug....");// developer analyzes the bug
		statusBug(bug);//developer updates status
	}

	void statusBug(Bug bug) {
		bug.setStatus(STATUS.OPEN);
		System.out.println("status set: " + bug.getStatus());
		if (bug.getPriority() == PRIORITY.LOW) {
			bug.setStatus(STATUS.DEFERRED);
		} else {
			bug.setStatus(STATUS.FIXED);
			System.out.println("status set: " + bug.getStatus());
		}

	}

	void bugReport() {
		System.out.println("bug reported");
	}

}
