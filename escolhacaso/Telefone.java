package projetoescola.escolhacaso;

import java.util.Scanner;

public class Telefone {

	public static void main(String[] args) {
			System.out.println("&&&&&&&&&&&&&&");
			System.out.println("");
			System.out.println("&&&&&&&&&&&&&&");
			System.out.println("Olá, você está falando com a empresa TELECELL");
			
			Scanner digite = new Scanner(System.in);
				System.out.println("Qual serviço deseja ser encaminhamento ?");
				System.out.println("(1) Vendas  (2) Compras  (3) Manutenção  (4) Cancelamento");
			int service = digite.nextInt();
				System.out.println("");
			
					switch(service) {
						case 1: System.out.println("Vendas"); break;
						case 2: System.out.println("Compras"); break;
						case 3: System.out.println("Manutenção"); break;
						case 4: System.out.println("Cancelamento"); break;
						default: System.out.println("Não foi possível encaminhar");
				}
				
		
		

	}

}
