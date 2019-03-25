package com.assignment2.rudia;
import junit.framework.TestCase;
import junit.framework.TestSuite;
public class TestAll extends TestCase{
	public static TestSuite suite() {
		TestSuite suite = new TestSuite("All Test");
		suite.addTest(new TestSuite(TestDateUtil.class));
		suite.addTest(new TestSuite(TestDateUtil.class));
		suite.addTest(new TestSuite(TestDateUtil.class));
		suite.addTest(new TestSuite(TestDateUtil.class));
		suite.addTestSuite(TestDateUtil.class);
		return suite;
	}
}
