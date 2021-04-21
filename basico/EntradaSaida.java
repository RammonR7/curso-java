package cursojava.basico;

import java.util.Scanner;

public class EntradaSaida {

	public static void main(String[] args) {
		// Criação de variáveis
		String nome;
		int idade;
		double altura;
		
		Scanner abc = new Scanner (System.in);
		
		System.out.println("Digite seu nome:");
		nome = abc.nextLine();
		System.out.println();
		
		System.out.println("Digite sua idade:");
		idade = abc.nextInt();
		System.out.println();
		
		System.out.println("Digite sua altura");
		altura = abc.nextDouble();
		System.out.println();
		
		System.out.println("Nome:" +nome);
		System.out.println("Idade:" +idade);
		System.out.println("Altura:" +altura);
		
		System.out.printf("Nome: %s \nidade: %d \naltura %.2f", nome,idade,altura);

	}

}
