package tests;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import pages.ContaPage;
import pages.MenuPage;
import suporte.BaseTest;

public class RemoverMovimentacaoContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContaPage contaPage = new ContaPage();
	
	@Test
	public void testExcluirContaEmUso() {
		menuPage.acessarTelaListarConta();
		
		contaPage.clicarBotaoExcluir("NiltonTesteAlterado");
		assertEquals("Conta em uso na movimenta��es", contaPage.obterMensagemErro());
	}

}
