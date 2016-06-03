package junit;

import java.util.ArrayList;

import produs.TelefonieFixa;
import notificari_facturi.IstoricStariFactura;
import notificari_facturi.MementoFactura;
import notificari_facturi.SalvareFacturi;
import junit.framework.TestCase;

public class TestCaseNotificariFactura extends TestCase {

	MementoFactura memento;

	public TestCaseNotificariFactura(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testSetMemento() {
		try {

			memento = new MementoFactura();
			memento.setStareFactura(" ");
			fail("Nu exista un memento valid");
		} catch (Exception e) {

		}
	}

	public void testDescriere() {
		try {
			String descriere = " ";
			SalvareFacturi salvareMemento = new SalvareFacturi();
			salvareMemento.introduceDescriere(descriere);
			fail("Nu exista descriere");
		} catch (Exception e) {

		}
	}

	public void testIstoric() {
		try {
			ArrayList<MementoFactura> mementos = new ArrayList<>();
			IstoricStariFactura istoric = new IstoricStariFactura();
			istoric.getSalvari();
			fail("Lista este goala! Verificati istoric!");
		} catch (Exception e) {

		}
	}

}
