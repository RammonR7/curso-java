package estruturascondicionais.java;
import java.util.Scanner;
public class EquacaoSegundoGrau {

	public static void main(String[] args) {
		Scanner reader = new Scanner (System.in);
			System.out.println();
			System.out.println("VALOR DE DELTA E POSS�VEIS SOLU��ES DE RA�ZES");
			System.out.println();
			System.out.println("Diga a : ");
				double a = reader.nextDouble();
			System.out.println("Diga b : ");
				double b = reader.nextDouble();
			System.out.println("Diga c : ");
				double c = reader.nextDouble();
				double delta = (Math.sqrt(Math.pow(b, 2) - (4 * a * c)));
					if (delta < 0)
						System.out.println("N�o existe ra�zes reais");
					else if (delta == 0)
						System.out.println("Existe uma �nica raiz real");
					else
						System.out.println("Existe duas ra�zes reais");
		
	}

}
