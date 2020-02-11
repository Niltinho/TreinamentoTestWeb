package pages;

import suporte.BasePage;

public class MovimentacaoPage extends BasePage {
	
	public void setTipoMovimentacao(String tipoMovimentacao) {
		selecionarCombo("tipo", tipoMovimentacao);
	}

}
