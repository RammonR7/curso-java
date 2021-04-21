package cursojava.basico;

public class EstruturaDecisao {

	public static void main(String[] args) {
		// OPERADOR TERNÁRIO QUE POR SER IGUAL VAI SER DIFERENTE DE SETE
     //String texto = 10 ==? "Dez é igual a sete":"Dez é diferente de sete";
     
    // SE O TESTE FOR FALSO, O IF NÃO EXECUTA, NÃO ACONTECE NADA
	int idade = 19;
     if (idade <= 18) {
    	 System.out.println ("Já pode tirar a CNH");
     }
     // IF-ELSE
     
     if (idade <= 18) {
    	 System.out.println ("Já pode tirar a CNH");
     }
     else {
    	 System.out.println("Não tem idade para dirigir");
     }
	}
	String semafaro = "Vermelho";
	 if (semaforo=="verde") {
		 System.out.println("Siga em frente!");
	}
	 else if (semaforo=="Amarelo"){
		 System.out.println("Tenha atenção!");
	}
	 else if (semaforo=="Vermelho") {
		 System.out.println("Pare");
	}
	 else {
		 System.out.println("Chame a autarquia de trânsito");
	}

}
}
