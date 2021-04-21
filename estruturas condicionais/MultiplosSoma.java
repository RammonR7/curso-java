package estruturascondicionais.java;

public class MultiplosSoma {

	public static void main(String[] args) {
		int a = 3;
		int b =5;
		int resultado = 0;
		for (int n = 1; n <= 1000; n++) {
			if (n % a == 0 || n % b == 0) {
				resultado += n;
			}
			System.out.println(resultado);
						
			}


	}


}

