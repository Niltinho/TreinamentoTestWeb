package tests;


import org.junit.Assert;
import org.junit.Test;

import pages.HomePage;
import pages.MenuPage;
import suporte.BaseTest;

public class SaldoTest extends BaseTest {
	
	MenuPage page = new MenuPage();
	HomePage homePage = new HomePage();
		
	@Test
	public void testSaldoConta() {
		page.acessarTelaPrincipal();
		
		Assert.assertEquals("-150.00", homePage.validarSaldoConta("NiltonTesteAlterado"));
	}

}
