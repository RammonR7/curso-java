package cursojava.basico;

public class EstruturaDecisao {

	public static void main(String[] args) {
		// OPERADOR TERN�RIO QUE POR SER IGUAL VAI SER DIFERENTE DE SETE
     //String texto = 10 ==? "Dez � igual a sete":"Dez � diferente de sete";
     
    // SE O TESTE FOR FALSO, O IF N�O EXECUTA, N�O ACONTECE NADA
	int idade = 19;
     if (idade <= 18) {
    	 System.out.println ("J� pode tirar a CNH");
     }
     // IF-ELSE
     
     if (idade <= 18) {
    	 System.out.println ("J� pode tirar a CNH");
     }
     else {
    	 System.out.println("N�o tem idade para dirigir");
     }
	}
	String semafaro = "Vermelho";
	 if (semaforo=="verde") {
		 System.out.println("Siga em frente!");
	}
	 else if (semaforo=="Amarelo"){
		 System.out.println("Tenha aten��o!");
	}
	 else if (semaforo=="Vermelho") {
		 System.out.println("Pare");
	}
	 else {
		 System.out.println("Chame a autarquia de tr�nsito");
	}

}
}
