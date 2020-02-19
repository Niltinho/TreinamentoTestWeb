package suporte;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
/////// Campo ///////////////
	
	public void escreverCampo(By by, String texto) {
		DriverFactory.getDriver().findElement(by).sendKeys(texto, Keys.ENTER);
	}

	
	public void escreverCampo(String id_campo, String texto) {
		DriverFactory.getDriver().findElement(By.id(id_campo)).clear();
		DriverFactory.getDriver().findElement(By.id(id_campo)).sendKeys(texto);
	}
	
	public void escreverCampo2(String name_campo, String texto) {
		DriverFactory.getDriver().findElement(By.name(name_campo)).sendKeys(texto);
	}
	public void limparCampo(String id_campo) {
		DriverFactory.getDriver().findElement(By.id(id_campo)).clear();
	}
	public void limparCampo2(String id_campo) {
		DriverFactory.getDriver().findElement(By.name(id_campo)).clear();
	}
	public void confirmarCampo(String id_campo) {
		DriverFactory.getDriver().findElement(By.id(id_campo)).sendKeys(Keys.ENTER);;
	}
	public String obterValorCampo(By by) {
		return DriverFactory.getDriver().findElement(by).getText();
	}
	public String obterValorCampo(String id_campo) {
		return obterValorCampo(By.id(id_campo));
	}
	public String obterValorCampo_3(String id_campo3) {
		return DriverFactory.getDriver().findElement(By.xpath(id_campo3)).getTagName();
	}
	public String validarCampo(String validaCampo) {
		return DriverFactory.getDriver().findElement(By.xpath(validaCampo)).getText();
	}
	
	public boolean validarCampo_2(String validaCampo_2) {
		return DriverFactory.getDriver().findElement(By.xpath(validaCampo_2)).isEnabled();
	}
	
	public void escreverCampoAction(String xpath_campo, String valor){
		Actions act = new Actions(DriverFactory.getDriver());
		WebElement escreverCampo = DriverFactory.getDriver().findElement(By.xpath(xpath_campo));
		act.sendKeys(escreverCampo, valor).perform();
	}
	public void apagarCampoAction(String xpath_campo){
		Actions act = new Actions(DriverFactory.getDriver());
		WebElement apagarCampo = DriverFactory.getDriver().findElement(By.xpath(xpath_campo));
		act.sendKeys(apagarCampo, "").perform();
	}
	public void confirmarCampoAction(String xpath_campo){
		Actions act = new Actions(DriverFactory.getDriver());
		WebElement escreverCampo = DriverFactory.getDriver().findElement(By.xpath(xpath_campo));
		act.sendKeys(escreverCampo, Keys.ENTER).perform();
	}
	
	
	//////////////// Radio Button ///////////////
	public boolean validarRadio(String validaRadio) {
		return DriverFactory.getDriver().findElement(By.xpath(validaRadio)).isSelected();
	}
	
	public void selecionarRadio2(String by) {
		
	}
	
	public void selecionarRadio(String id_radio) {
		DriverFactory.getDriver().findElement(By.id(id_radio)).click();
	}
	
	
	////////////////Checkbox ///////////////
	public boolean validarCheckbox(String validaCheckbox) {
	return DriverFactory.getDriver().findElement(By.xpath(validaCheckbox)).isSelected();
	}
	
	public void selecionarCheckbox2(String by) {
	
	}
	
	public void selecionarCheckbox(String id_checkbox) {
	DriverFactory.getDriver().findElement(By.id(id_checkbox)).click();
	}
		
	
	
	//////////// Botão ////////////
	public void clicarBotao(By by){
		DriverFactory.getDriver().findElement(by).click();
	}
	public void clicarBotao(String id_botao){
		clicarBotao(By.id(id_botao));;
	}
	public void clicarBotaoAction(String xpath_botao){
		Actions act = new Actions(DriverFactory.getDriver());
		WebElement clique = DriverFactory.getDriver().findElement(By.xpath(xpath_botao));
		act.click(clique).perform();
	}
	public void clicarBotaoAction2(String xpath_botao){
		Actions act = new Actions(DriverFactory.getDriver());
		WebElement clique = DriverFactory.getDriver().findElement(By.xpath(xpath_botao));
		act.moveToElement(clique).click().build().perform();
	}
	
	////Link
	
	public void clicarLink(String link) {
		DriverFactory.getDriver().findElement(By.linkText(link)).click();
	}
	
	
	////////// Clicar Menu/Aba ////////////////
	public void clicarMenu(String xpath_menu){
		DriverFactory.getDriver().findElement(By.xpath(xpath_menu)).click();
	}
	public void clicarMenu2(String id_menu){
		DriverFactory.getDriver().findElement(By.id(id_menu)).click();
	}
	public void clicarMenu3(String id_menu){
		DriverFactory.getDriver().findElement(By.name(id_menu)).click();
	}
	
	
	/////// Interagir Janela //////////////
	public void trocarJanela(String id_frame) {
		WebElement fr = DriverFactory.getDriver().findElement(By.name(id_frame));
		DriverFactory.getDriver().switchTo().frame(fr);
	}
	public void trocarJanela2(String id_frame) {
		WebElement fr = DriverFactory.getDriver().findElement(By.id(id_frame));
		DriverFactory.getDriver().switchTo().frame(fr);
	}
	
	public void descerJanela() {
		JavascriptExecutor jse = (JavascriptExecutor) DriverFactory.getDriver();
		jse.executeScript("scrollBy(0,500)", "");
	}
	
	
	
	//////// Espera Explícita ///////////////
	public void esperarElementoAction(String xpath_elemento) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 50);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath_elemento)));
	}
	public void esperarElementoAction2(String xpath_elemento) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath_elemento)));
	}
	public void esperarElementoAction3(String xpath_elemento) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 50);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath_elemento)));
	}
	public void esperarElementoAction4(String xpath_elemento) {
		WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(xpath_elemento)));
	}
	
	
	//////// Combo //////////////
	public void selecionarCombo(String id, String valor) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.selectByVisibleText(valor);
	}
	
	public void obterValorCombo(String id) {
		WebElement element = DriverFactory.getDriver().findElement(By.id(id));
		Select combo = new Select(element);
		combo.getFirstSelectedOption().getText();
	}
	
	
	////////// Tabela /////////
	
	
	public WebElement obterCelula(String colunaBusca, String valor, String colunaBotao, String idTabela){
		//procurar coluna do registro
		WebElement tabela = DriverFactory.getDriver().findElement(By.xpath("//*[@id='"+idTabela+"']"));
		int idColuna = obterIndiceColuna(colunaBusca, tabela);
		
		//encontrar a linha do registro
		int idLinha = obterIndiceLinha(valor, tabela, idColuna);
		
		//procurar coluna do botao
		int idColunaBotao = obterIndiceColuna(colunaBotao, tabela);
		
		//clicar no botao da celula encontrada
		WebElement celula = tabela.findElement(By.xpath(".//tr["+idLinha+"]/td["+idColunaBotao+"]"));
		return celula;
	}
	
	public void clicarBotaoTabela(String colunaBusca, String valor, String colunaBotao, String idTabela){
		WebElement celula = obterCelula(colunaBusca, valor, colunaBotao, idTabela);
		celula.findElement(By.xpath(".//input")).click();
		
	}

	protected int obterIndiceLinha(String valor, WebElement tabela, int idColuna) {
		List<WebElement> linhas = tabela.findElements(By.xpath("./tbody/tr/td["+idColuna+"]"));
		int idLinha = -1;
		for(int i = 0; i < linhas.size(); i++) {
			if(linhas.get(i).getText().equals(valor)) {
				idLinha = i+1;
				break;
			}
		}
		return idLinha;
	}

	protected int obterIndiceColuna(String coluna, WebElement tabela) {
		List<WebElement> colunas = tabela.findElements(By.xpath(".//th"));
		int idColuna = -1;
		for(int i = 0; i < colunas.size(); i++) {
			if(colunas.get(i).getText().equals(coluna)) {
				idColuna = i+1;
				break;
			}
		}
		return idColuna;
	}
	
	
	
	/// Alert
	
	public void alertaAceitar() {
		Alert alert = DriverFactory.getDriver().switchTo().alert();
		alert.accept();
	}
	
	public String alertaObterTexto() {
		Alert alert = DriverFactory.getDriver().switchTo().alert();
		return alert.getText();
	}
	
	public String alertaObterTextoEAceitar() {
		Alert alert = DriverFactory.getDriver().switchTo().alert();
		String valor = alert.getText();
		alert.accept();
		return valor;
		
	}
	
	
	//// Prática a não usar ////
	public void esperaElemento() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
