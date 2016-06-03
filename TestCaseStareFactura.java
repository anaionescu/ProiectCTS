package junit;

import stare_factura.PlatitaCuRestDePlata;
import stare_factura.Stare;
import stare_factura.StareNeplatita;
import stare_factura.StarePlatita;
import factura.FacturaTelecomunicatii;
import factura.FacturaTelefon;
import junit.framework.TestCase;

public class TestCaseStareFactura extends TestCase {

	public TestCaseStareFactura(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testStareFacturaPlatita() {
		try {
			StarePlatita facturaPlatita = new StarePlatita(null);
			facturaPlatita.setStare("NEPLATITA");
			fail("Starea nu poate fi NULL");
		} catch (Exception e) {

		}
	}

	public void testStareNeplatita() {
		try {
			StareNeplatita facturaNeplatita = new StareNeplatita();
			facturaNeplatita.setStare(null);
			fail("Starea nu poate fi NULL");
		} catch (Exception e) {

		}
	}

	public void testExistentaStare() {
		try {
			PlatitaCuRestDePlata platita = new PlatitaCuRestDePlata();
			platita.afisareStare();
			fail("Starea nu poate fi NULL");
		} catch (Exception e) {

		}
	}

	public void testStareNull() {
		try {
			PlatitaCuRestDePlata platita = new PlatitaCuRestDePlata(null);
			platita.afisareStare();
			fail("Starea nu poate fi NULL");
		} catch (Exception e) {

		}
	}

}
