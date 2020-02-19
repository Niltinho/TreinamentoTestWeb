package suporte;

public class Propriedades {
	
	public static boolean FECHAR_BROWSER = false;
	
	public static Browsers browser = Browsers.CHROME;
	
	public static String NOME_CONTA_ALTERADA = "NiltonTesteAlterada_" + System.currentTimeMillis();

	public enum Browsers {
		CHROME,
		FIREFOX
	}
}
