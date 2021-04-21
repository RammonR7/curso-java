package estruturascondicionais.java;

import java.util.ArrayList;

public class SomaDeMultiplos {

	public static void main(String[] args) {
		int multiplos = 1, soma = 0;
		ArrayList <Integer> multiplo = new ArrayList <> ();
		while (multiplos < 1000) {
			if (multiplos % 3 == 0 || multiplos % 5 ==0) {
				soma += multiplos;
				multiplo.add(multiplos);
			}
			multiplos ++;
		}
for (int numero : multiplo) {
	System.out.println(numero);
}
System.out.println(soma);
	}

}
