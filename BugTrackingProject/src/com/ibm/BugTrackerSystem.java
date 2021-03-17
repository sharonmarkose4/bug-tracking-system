package com.ibm;

public class BugTrackerSystem {
	public static void main(String[] args) {
		Bug bug = new Bug(101, "hgj", "hsbSystem", "Line135", "H", STATUS.NEW, PRIORITY.HIGH);
		Manager manager = new Manager("Ramesh", 0017);
		Developer developer = new Developer("Raj", 0171);
		Tester tester = new Tester("Ram", 0272);
		manager.assign(bug);
		developer.analyseBug(bug);
		if (bug.getStatus() == STATUS.FIXED) {
			tester.analyseBug(bug);
		}

	}
}
