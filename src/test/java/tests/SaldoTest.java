package tests;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import pages.HomePage;
import pages.MenuPage;
import suporte.BaseTest;
import suporte.Propriedades;

public class SaldoTest extends BaseTest {
	
	MenuPage page = new MenuPage();
	HomePage homePage = new HomePage();
		
	@Test
	public void testSaldoConta() {
		page.acessarTelaPrincipal();
		
		assertEquals("-150.00", homePage.validarSaldoConta(Propriedades.NOME_CONTA_ALTERADA));
	}

}
