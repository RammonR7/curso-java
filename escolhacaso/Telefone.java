package projetoescola.escolhacaso;

import java.util.Scanner;

public class Telefone {

	public static void main(String[] args) {
			System.out.println("&&&&&&&&&&&&&&");
			System.out.println("");
			System.out.println("&&&&&&&&&&&&&&");
			System.out.println("Ol�, voc� est� falando com a empresa TELECELL");
			
			Scanner digite = new Scanner(System.in);
				System.out.println("Qual servi�o deseja ser encaminhamento ?");
				System.out.println("(1) Vendas  (2) Compras  (3) Manuten��o  (4) Cancelamento");
			int service = digite.nextInt();
				System.out.println("");
			
					switch(service) {
						case 1: System.out.println("Vendas"); break;
						case 2: System.out.println("Compras"); break;
						case 3: System.out.println("Manuten��o"); break;
						case 4: System.out.println("Cancelamento"); break;
						default: System.out.println("N�o foi poss�vel encaminhar");
				}
				
		
		

	}

}
