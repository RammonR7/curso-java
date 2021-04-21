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
	// FUNÇÃO RETORNO DO TIPO INT E RECEBE DOIS PARÂMETROS
    static int soma (int a, int b) {
    	return a + b;
    	
    	
    	
    }
    // FUNÇÃO IMPRIME, MAS NÃO RETORNA E TEM UM PARÂMETRO
    static void quadrado (int numero) {
    		System.out.println(numero * numero);
    
    }
    // FUNÇÃO NÃO RECEBE PARÂMETRO, MAS RETORNA TEXTO
    static String mensagem () {
    	return "Mensagem do sistema";
    }
    // FUNÇÃO NÃO RECEBE PARÂMETRO E NÃO RETORNA NADA, MAS IMPRIME UM TEXTO
    static void OlaMundo () {
    		System.out.println("Olá Mundo.....");
    }
}
