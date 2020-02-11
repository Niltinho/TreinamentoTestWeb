package tests;


import static org.testng.Assert.assertEquals;

import org.junit.Test;

import pages.ContaPage;
import pages.MenuPage;
import suporte.BaseTest;

public class ContaTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	ContaPage contaPage = new ContaPage();
	
	@Test
	public void testInserirConta() {
		menuPage.acessarTelaAdicionarConta();
		contaPage.setConta("NiltonTeste");
		contaPage.clicarBotaoSalvar();
		assertEquals("Conta adicionada com sucesso!", contaPage.obterMensagemSucesso());
	}
	
	@Test
	public void testAlterarConta() {
		menuPage.acessarTelaListarConta();
		contaPage.alterarConta();
		contaPage.setConta("NiltonTesteAlterado");
		contaPage.clicarBotaoSalvar();
		assertEquals("Conta alterada com sucesso!", contaPage.obterMensagemSucesso());
		
		
	}
	
	@Test
	public void testInserirContaMesmoNome() {
		menuPage.acessarTelaAdicionarConta();
		contaPage.setConta("NiltonTesteAlterar");
		contaPage.clicarBotaoSalvar();
		assertEquals("Já existe uma conta com esse nome!", contaPage.obterMensagemErro());
	}
}
