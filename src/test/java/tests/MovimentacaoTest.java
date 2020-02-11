package tests;

import org.junit.Test;

import pages.MenuPage;
import pages.MovimentacaoPage;
import suporte.BaseTest;

public class MovimentacaoTest extends BaseTest {
	
	MenuPage menuPage = new MenuPage();
	MovimentacaoPage movimentacaoPage = new MovimentacaoPage();
	
	@Test
	public void testInserirMovimentacao() {
		menuPage.acessarTelaInserirMovimentacao();
		movimentacaoPage.setTipoMovimentacao("Despesa");
		
	}

}
