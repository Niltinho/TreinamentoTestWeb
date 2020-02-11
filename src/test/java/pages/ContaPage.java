package pages;

import org.openqa.selenium.By;

import suporte.BasePage;

public class ContaPage extends BasePage {
	
	public void setConta(String conta) {
		escreverCampo("nome", conta);
	}
	
	public void clicarBotaoSalvar() {
		clicarBotao(By.xpath("//button[text()='Salvar']"));
	}
	
	public String obterMensagemSucesso() {
		return obterValorCampo(By.xpath("//div[@class='alert alert-success']"));
	}
	
	public void alterarConta() {
		clicarBotao(By.xpath("//span[@class='glyphicon glyphicon-edit']"));
	}
	
	public String obterMensagemErro() {
		return obterValorCampo(By.xpath("//div[@class='alert alert-danger']"));
	}
	
}
