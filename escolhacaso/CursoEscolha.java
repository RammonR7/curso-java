package projetoescola.escolhacaso;

import java.util.Scanner;

public class CursoEscolha {

	public static void main(String[] args) {
		
		Scanner digite = new Scanner (System.in);
		int Escolha;
		String Curso;
		
		System.out.println("Diga qual curso deseja [1] Programação [2] Excel [3] Photshop [4] Hardware");
		Escolha = digite.nextInt();
		
			switch (Escolha) {
				case 1: Curso= "Programação"; break;
				case 2: Curso = "Excel"; break;
				case 3: Curso = "Photshop"; break;
				case 4: Curso = "Hardware"; break;
				default: Curso = "Curso inválido"; break;
		
		}
			
		System.out.println("Sua escolha foi de: " +Curso);
		digite.close();
		

	}

}
