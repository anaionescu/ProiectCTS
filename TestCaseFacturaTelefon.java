package junit;

import factura.FacturaTelecomunicatii;
import factura.FacturaTelefon;
import junit.framework.TestCase;

public class TestCaseFacturaTelefon extends TestCase {

	public TestCaseFacturaTelefon(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testConstructor() {

		System.out.println("Test validitate factura telefon");
		String denumireProdus = null;
		double totalPlata = -100;
		double costSuplimentar = -100;

		try {
			FacturaTelefon facturaTelefon = new FacturaTelefon(totalPlata,
					costSuplimentar, denumireProdus);
			fail("Constructorul nu suporta valori negative/null");
		} catch (Exception e) {

		}
	}

	public void testZecimale() {
		double totalPlata = 100.00;
		try {
			FacturaTelefon facturaTelefon = new FacturaTelefon(totalPlata, 100,
					"TV");
			assertEquals("Sumele trebuie sa aiba o zecimala", 100.0, totalPlata);
		} catch (Exception e) {

		}
	}

	public void testValidareSumaPrimita() {
		try {
			FacturaTelefon factura = new FacturaTelefon(150, 10, "Telefon Fix");
			factura.platesteFactura(100);
			fail("Factura nu poate fi achitata!");
		} catch (Exception e) {

		}
	}

}
