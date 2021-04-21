package estruturascondicionais.java;
import java.util.Scanner;
public class MediaValorIf {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
	System.out.println();
	System.out.println("--------MÉDIA DE NOTAS---------");
	System.out.println();
			System.out.println("Primeira nota");
				double noteone = leia.nextDouble();
			System.out.println("Segunda nota");
				double notetwo = leia.nextDouble();
			System.out.println("Terceira nota");
				double notethree = leia.nextDouble();
				double media = (double) (noteone + notetwo + notethree) / 3;
					if (media >= 7.0) 
						System.out.println("Passou de ano " + (double) media);
					
					else if (media <= 6.9 && media >= 4.0) 
						System.out.println("Esta em recuperação " + (double) media);
					
					else 
						System.out.println("Esta reprovado" + (double) media);
					
		

	}

}
