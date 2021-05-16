package projetoescola.escolhacaso;

import java.util.Scanner;

public class Doacao {

	public static void main(String[] args) {
		
		Scanner digite = new Scanner(System.in);
		int escolha;
		String doar;
		
		System.out.println("Digite a opção de doação: [1] - [2] - [3] - [4] ");
		escolha = digite.nextInt();
		
			switch(escolha) {
				case 1: doar = "R$ 10.00"; break;
				case 2: doar = "R$ 20.00"; break;
				case 3: doar = "R$ 30.00"; break;
				case 4: doar = "R$ 40.00"; break;
				default:doar = "Qualquer valor"; break;
		}
		
			System.out.println ("A doação foi de" +doar);
	}
	
		

}
