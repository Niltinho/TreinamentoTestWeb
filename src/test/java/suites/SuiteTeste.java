package suites;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

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
	
	/*@BeforeClass
	public static void inicializar() {
		page.acessarTelaInicial();
		
		page.setEmail("nilton@teste.com.br");
		page.setPassword("080114");
		page.clicarBotaoEntrar();
		
		DriverFactory.killDriver();
	}*/
	
	@AfterClass
	public static void finaliza() {
		DriverFactory.killDriver();
	}
	
}
