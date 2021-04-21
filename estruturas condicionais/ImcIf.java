package estruturascondicionais.java;

import java.util.Scanner;

public class ImcIf {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
// Peso		
		System.out.println("Your weight:");		
			double weight = reader.nextDouble();
// Altura
		System.out.println("Your height:");
			double height = reader.nextDouble();
			double imc = weight / Math.pow(height, 2);
				if (imc < 18.5) {
// Voce esta abaixo do peso			
					System.out.println("You are below the weight " + imc+ " kg");
					System.out.println();
		}
				else if (imc >= 18.5 && imc <= 25.0) {
// Voce esta no peso ideal			
					System.out.println("You are at the ideal weight " + imc+  " kg");
					System.out.println();
		}
				else { 
// Voce esta acima do peso					
					System.out.println("Are you overweight " + imc+  " kg");
					System.out.println();
		}
		
		
		

	}

}
