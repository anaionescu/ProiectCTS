package junit;

import casier.Casier;
import casier.Casierie;
import junit.framework.TestCase;

public class TestCaseCasier extends TestCase {

	private Casier casier;
	public Casierie casierie1;
	public Casierie casierie2;

	public TestCaseCasier(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPrimireFacturaInexistenta() {

		try {
			this.casier.primireFactura(null);
			fail("Metoda primireFactura nu genereaza exceptii pentru cazul in care nu este primita nici o factura ");
		} catch (Exception ex) {

		}

	}

	public void testNrOficiu() {

		try {
			this.casier.setNrOficiu(0);
			fail("Nr. oficiu invalid");
		} catch (Exception ex) {

		}

	}

}
