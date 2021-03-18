package com.ibm;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class TestDeveloper {
	Developer developer;
	Bug bug;

	@BeforeEach
	void init() {
		developer = new Developer("John", 101);
	}

	@Test
	void testSetStatusBugFixed() {
		bug=new Bug(101, "ghj", "lksystems", "line3", "H", STATUS.NEW, PRIORITY.HIGH);
		STATUS status=developer.setStatusBug(bug);
		Assert.assertEquals(STATUS.FIXED, status);
	}
	@Test
	void testSetStatusBuDeferredg() {
		bug=new Bug(101, "ghj", "lksystems", "line3", "H", STATUS.NEW, PRIORITY.LOW);
		STATUS status=developer.setStatusBug(bug);
		Assert.assertEquals(STATUS.DEFERRED, status);
	}

}
