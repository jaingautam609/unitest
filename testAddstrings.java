package jUnitTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddstrings {

	@Test
	public void test() {
		jUnitFunction junitstring = new jUnitFunction();
		String result = junitstring.addStrings("capstone", "project");
		assertEquals("capstoneproject", result);
	}

}
