package tests;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import pages.MenuPage;
import pages.MovimentacaoPage;
import suporte.BaseTest;
import utils.DataUtils;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class MovimentacaoTest extends BaseTest {
	
	private MenuPage menuPage = new MenuPage();
	private MovimentacaoPage movimentacaoPage = new MovimentacaoPage();
	
	@Test
	public void test1_InserirMovimentacao() {
		menuPage.acessarTelaInserirMovimentacao();
		
		movimentacaoPage.setTipoMovimentacao("Despesa");
		movimentacaoPage.setDataMovimentacao(DataUtils.obterDataFormatada(new Date()));
		movimentacaoPage.setDataPagamento(DataUtils.obterDataFormatada(new Date()));
		movimentacaoPage.setDescricao("Movimenta��o Teste");
		movimentacaoPage.setInteressado("Interessado Teste");
		movimentacaoPage.setValor("150");
		movimentacaoPage.setSituacaoPago();
		movimentacaoPage.clicarBotaoSalvar();
		Assert.assertEquals("Movimenta��o adicionada com sucesso!", movimentacaoPage.obterMensagemSucesso());
	}
	
	@Test
	public void test2_CamposObrigatorios() {
		menuPage.acessarTelaInserirMovimentacao();
		
		movimentacaoPage.clicarBotaoSalvar();
		//assertEquals("Data da Movimenta��o � obrigat�rio\nData do pagamento � obrigat�rio\nDescri��o � obrigat�rio\nInteressado � obrigat�rio\nValor � obrigat�rio\nValor deve ser um n�mero", movimentacaoPage.obterMensagemErro());
		assertTrue(movimentacaoPage.obterMensagemErro().contains("Data da Movimenta��o � obrigat�rio\nData do pagamento � obrigat�rio\nDescri��o � obrigat�rio\nInteressado � obrigat�rio\nValor � obrigat�rio\nValor deve ser um n�mero"));
	}
	
	@Test
	public void test3_InserirMovimentacaoFutura() {
		menuPage.acessarTelaInserirMovimentacao();
		
		Date dataFutura = DataUtils.obterDataComDiferencaDias(5);
		
		movimentacaoPage.setTipoMovimentacao("Despesa");
		movimentacaoPage.setDataMovimentacao(DataUtils.obterDataFormatada(dataFutura));
		movimentacaoPage.setDataPagamento(DataUtils.obterDataFormatada(dataFutura));
		movimentacaoPage.setDescricao("Movimenta��o Teste");
		movimentacaoPage.setInteressado("Interessado Teste");
		movimentacaoPage.setValor("150");
		movimentacaoPage.setSituacaoPago();
		movimentacaoPage.clicarBotaoSalvar();
		assertTrue(movimentacaoPage.obterMensagemErro().contains("Data da Movimenta��o deve ser menor ou igual � data atual"));
	}

}
