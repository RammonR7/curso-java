package estruturascondicionais.java;

public class Switch {

	public static void main(String[] args) {
		char opcao = 'b';
		
	// SWITCH (VARI�VEL)
		switch (opcao) {
	// DENTRO DOS SWITCHS TEM OS CASES
	// SE N�O TIVER O BREAK, VAI EXECUTANDO TODOS OS CASOS AT� CHEGAR NO DEFAULT	
			case 'a': System.out.println ("Cadastrar Produto"); break;
			case 'b': System.out.println ("Visualzar Detalhes"); break;
			case 'c': System.out.println ("Editar Produto"); break;
			case 'd': System.out.println ("Deletar Produto"); break;
	// DEFAULT � A MESMA FUN��O DO ELSE
	// N�O H� NECESSIDADE DE COLOCAR BREAK NO DEFAULT		
			default: System.out.println ("Opc�o Inv�lida"); ; 
		}

	}

}
