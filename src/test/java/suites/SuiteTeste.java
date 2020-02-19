package suites;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import pages.LoginPage;
import suporte.DriverFactory;
import tests.ContaTest;
import tests.MovimentacaoTest;
import tests.RemoverMovimentacaoContaTest;
import tests.ResumoMensalTest;
import tests.SaldoTest;

@RunWith(Suite.class)
@SuiteClasses({
	ContaTest.class,
	MovimentacaoTest.class,
	RemoverMovimentacaoContaTest.class,
	SaldoTest.class,
	ResumoMensalTest.class
})
public class SuiteTeste {
	
	private static LoginPage page = new LoginPage();
	
	@BeforeClass
	public static void inializa() {
		page.acessarTelaInicial();
		
		page.setEmail("nilton@teste.com.br");
		page.setPassword("080114");
		page.clicarBotaoEntrar();
		
	}
	
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}

}
