package estruturascondicionais.java;

public class SomaFibonnacciPares {

	public static void main(String[] args) {
		int a = 1, b = 0, c = 0, soma = 0;
		while (c < 5000) {
			System.out.println(c);
			if (c % 2 == 0)
				soma += c;
			c = a + b;
			a = b;
			b = c;
		
		}
		System.out.println(soma);

	}

}
