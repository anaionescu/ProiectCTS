package junit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteNotificareStareFactura {

	public static Test suite() {
		TestSuite suite = new TestSuite();

		// adaugare partiala de metode
		suite.addTest(new TestCaseStareFactura("testExistentaStare"));
		suite.addTest(new TestCaseStareFactura("testStareNull"));
		suite.addTest(new TestCaseStareFactura("testStareNeplatita"));
		suite.addTest(new TestCaseStareFactura("testStareFacturaPlatita"));

		suite.addTest(new TestCaseNotificariFactura("testDescriere"));
		suite.addTest(new TestCaseNotificariFactura("testSetMemento"));
		suite.addTest(new TestCaseNotificariFactura("testIstoric"));
		// adaugare totala

		suite.addTestSuite(TestCaseStareFactura.class);
		suite.addTestSuite(TestCaseNotificariFactura.class);
		return suite;
	}

}
