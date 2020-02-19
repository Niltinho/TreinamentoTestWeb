package tests;

import static org.testng.Assert.assertEquals;

import org.junit.Test;

import pages.ContaPage;
import pages.MenuPage;
import suporte.BaseTest;
import suporte.Propriedades;

public class RemoverMovimentacaoContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContaPage contaPage = new ContaPage();
	
	@Test
	public void testExcluirContaEmUso() {
		menuPage.acessarTelaListarConta();
		
		contaPage.clicarBotaoExcluir(Propriedades.NOME_CONTA_ALTERADA);
		assertEquals("Conta em uso na movimentações", contaPage.obterMensagemErro());
	}

}
