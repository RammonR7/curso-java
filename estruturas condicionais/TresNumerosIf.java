package estruturascondicionais.java;

import java.util.Scanner;


public class TresNumerosIf {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
	System.out.println(">>>>>>>>>>>>>> DESCOBRIR O MAIOR N�MERO >>>>>>>>>>>>>>");
	System.out.println();
	System.out.println(" ");
				System.out.println ("Digite o primeiro n�mero");
			int usuario11 = ler.nextInt();
	System.out.println(" ");	
				System.out.println ("Digite o segundo n�mero");
			int usuario21 = ler.nextInt();
	System.out.println(" ");	
				System.out.println ("Digite o terceiro n�mero");
			int usuario31 = ler.nextInt();
					boolean comparar1 = usuario11 == usuario21 && usuario21 == usuario31;
					boolean comparar2 = usuario11 > usuario21 && usuario11 > usuario31;
					boolean comparar3 = usuario21 > usuario11 && usuario21 > usuario31;
						if (comparar1) {
							System.out.println ("Os n�meros s�o iguais");
	System.out.println();
						}
						else if (comparar2) {
							System.out.println ("O maior n�mero � " + usuario21);
	System.out.println();
						}
						else if (comparar3) {
							System.out.println ("O maior n�mero � " + usuario21);
	System.out.println();	
						}
						else {
							System.out.println ("O maior n�mero � " + usuario31);
	System.out.println();
						}

	}

}
