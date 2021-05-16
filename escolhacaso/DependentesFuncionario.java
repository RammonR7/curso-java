package projetoescola.escolhacaso;

import java.util.Scanner;

public class DependentesFuncionario {

	public static void main(String[] args) {
		Scanner digite = new Scanner (System.in);
		System.out.print("Qual o nome do funcionário? ");
		String nome = digite.nextLine();
		System.out.print("Qual o salário do funcionário? R$");
		double salario = digite.nextDouble();
		System.out.println("Qual é o número de dependentes? ");
		int dependentes = digite.nextInt();
		double novosalario;
			switch(dependentes) {
				case 0: novosalario = salario + (salario*0.05); break;
				case 1: novosalario = salario + (salario*0.10); break;
				case 2: novosalario = salario + (salario*0.10); break;
				case 3: novosalario = salario + (salario*0.10); break;
				case 4: novosalario = salario + (salario*0.15); break;
				case 5: novosalario = salario + (salario*0.15); break;
				case 6: novosalario = salario + (salario*0.15); break;
				default: novosalario = salario + (salario*0.18); break;
				
				
				
			}
			System.out.println("O funcionário " +nome+ " tem o salário de R$" +novosalario);

	}

}
