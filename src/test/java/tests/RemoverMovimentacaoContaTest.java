package tests;


import org.junit.Assert;
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
		Assert.assertEquals("Conta em uso na movimentações", contaPage.obterMensagemErro());
	}

}
