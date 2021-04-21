package cursojava.basico;

public class Funcoes {

	public static void main(String[] args) {
		
		int result = soma (10,60);
			System.out.println(result);
			
		quadrado(7);
		
		String texto = mensagem ();
			System.out.println (texto);
			
			OlaMundo ();
	}
	// FUN��O RETORNO DO TIPO INT E RECEBE DOIS PAR�METROS
    static int soma (int a, int b) {
    	return a + b;
    	
    	
    	
    }
    // FUN��O IMPRIME, MAS N�O RETORNA E TEM UM PAR�METRO
    static void quadrado (int numero) {
    		System.out.println(numero * numero);
    
    }
    // FUN��O N�O RECEBE PAR�METRO, MAS RETORNA TEXTO
    static String mensagem () {
    	return "Mensagem do sistema";
    }
    // FUN��O N�O RECEBE PAR�METRO E N�O RETORNA NADA, MAS IMPRIME UM TEXTO
    static void OlaMundo () {
    		System.out.println("Ol� Mundo.....");
    }
}
