package junit;

import factura.FacturaTelecomunicatii;
import junit.framework.TestCase;

public class TestCaseFacturaTelecomunicatii extends TestCase {

	public TestCaseFacturaTelecomunicatii(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		System.out.println("Start Test");
	}

	protected void tearDown() throws Exception {
		System.out.println("Final Test");
		;
	}

	public void testDenumireProdusNull() {

		System.out.println("Test validitate denumire produs");
		String denumireProdus = null;
		try {
			FacturaTelecomunicatii facturaTelecomunicatii = new FacturaTelecomunicatii(
					0, denumireProdus);
			fail("Constructorul nu suporta valori NULL");
		} catch (Exception e) {
			// e.printStackTrace();
		}
	}

	public void testValidareSumaPrimita() {
		try {
			FacturaTelecomunicatii factura = new FacturaTelecomunicatii(150,
					"TV");
			factura.platesteFactura(100);
			fail("Factura nu poate fi achitata!");
		} catch (Exception e) {

		}
	}

	public void testValidareTotal() {
		try {
			FacturaTelecomunicatii factura = new FacturaTelecomunicatii(-150,
					"Internet");
			factura.platesteFactura(200);
			assertFalse("Valoarea facturii nu pote fi mai mica ca 0",
					factura.getTotalDePlata() < 0);
			System.out.println("Valoare negativa");
		} catch (Exception e) {

		}
	}

}
