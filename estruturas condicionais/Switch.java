package estruturascondicionais.java;

public class Switch {

	public static void main(String[] args) {
		char opcao = 'b';
		
	// SWITCH (VARIÁVEL)
		switch (opcao) {
	// DENTRO DOS SWITCHS TEM OS CASES
	// SE NÃO TIVER O BREAK, VAI EXECUTANDO TODOS OS CASOS ATÉ CHEGAR NO DEFAULT	
			case 'a': System.out.println ("Cadastrar Produto"); break;
			case 'b': System.out.println ("Visualzar Detalhes"); break;
			case 'c': System.out.println ("Editar Produto"); break;
			case 'd': System.out.println ("Deletar Produto"); break;
	// DEFAULT É A MESMA FUNÇÃO DO ELSE
	// NÃO HÁ NECESSIDADE DE COLOCAR BREAK NO DEFAULT		
			default: System.out.println ("Opcão Inválida"); ; 
		}

	}

}
