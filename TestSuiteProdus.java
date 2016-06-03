package junit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteProdus {

	public static Test suite() {
		TestSuite suite = new TestSuite();

		// adaugare partiala de metode
		suite.addTest(new TestCaseProdus("testValidareConstructorTipProdus"));
		suite.addTest(new TestCaseProdus("testValoriNullTipProdus"));
		suite.addTest(new TestCaseProdus("testGetInformatiiProdus"));

		// adaugare totala
		suite.addTestSuite(TestCaseProdus.class);

		return suite;
	}

}
