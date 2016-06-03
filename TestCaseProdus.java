package junit;

import produs.Produs;
import produs.ProdusAbstract;
import produs.TelefonieFixa;
import produs.TelefonieMobila;
import junit.framework.TestCase;

public class TestCaseProdus extends TestCase {
	TelefonieFixa telFix;
	TelefonieMobila telMobil;
	Produs produs;

	public TestCaseProdus(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		System.out.println("Initializare Test Case Produs");
	}

	protected void tearDown() throws Exception {
		System.out.println("Finalizare test");
	}

	public void testValidareConstructorTipProdus() {
		String tipAbnonament = " ";
		try {

			telFix = new TelefonieFixa(tipAbnonament);
			fail("Tipul de abonament nu contine o valoare valida");
		} catch (Exception e) {

		}
	}

	public void testValoriNullTipProdus() {
		String tipAbon = null;
		try {

			telFix = new TelefonieFixa(tipAbon);
			fail("Tipul de abonament nu contine o valoare valida");
		} catch (Exception e) {

		}
	}

	public void testGetInformatiiProdus() {

		try {
			TelefonieMobila telMobil = new TelefonieMobila(telFix);
			telMobil.getInformatii();
			fail("Nu exista informatii pentru acest produs!");
		} catch (Exception e) {

		}
	}

	public void testConstructor() {
		try {
			produs = new Produs(" ", " ", -10);
			fail("Campuri incorect completate");
		} catch (Exception e) {

		}
	}

}
