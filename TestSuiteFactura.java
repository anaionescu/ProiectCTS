package junit;

import junit.framework.Test;
import junit.framework.TestSuite;

public class TestSuiteFactura {

	public static Test suite() {
		TestSuite suite = new TestSuite();

		// adaugare partiala de metode
		suite.addTest(new TestCaseFacturaTelefon("testConstructor"));
		suite.addTest(new TestCaseFacturaTelefon("testValidareSumaPrimita"));
		suite.addTest(new TestCaseFacturaTelefon("testZecimale"));

		suite.addTest(new TestCaseFacturaTelecomunicatii(
				"testDenumireProdusNull"));
		suite.addTest(new TestCaseFacturaTelecomunicatii(
				"testValidareSumaPrimita"));
		suite.addTest(new TestCaseFacturaTelecomunicatii("testValidareTotal"));
		// adaugare totala

		suite.addTestSuite(TestCaseFacturaTelefon.class);
		suite.addTestSuite(TestCaseFacturaTelecomunicatii.class);
		return suite;
	}

}
