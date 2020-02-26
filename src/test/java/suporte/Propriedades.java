package suporte;

public class Propriedades {
	
	public static boolean FECHAR_BROWSER = true;
	
	public static Browsers BROWSER = Browsers.CHROME;
	
	public static TipoExecucao TIPO_EXECUCAO = TipoExecucao.GRID;
	
	public static String NOME_CONTA_ALTERADA = "NiltonTesteAlterada_" + System.currentTimeMillis();

	public enum Browsers {
		CHROME,
		FIREFOX
	}
	
	public enum TipoExecucao {
		LOCAL,
		GRID,
		NUVEM
	}
}
