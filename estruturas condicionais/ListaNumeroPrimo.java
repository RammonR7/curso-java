package estruturascondicionais.java;

public class ListaNumeroPrimo {

	public static void main(String[] args) {
		int n = 0;
		for (int p =0; p <= 1001; p++) {
			if (p % n == 1 && p == 1001)
				System.out.println(p);
		}

	}

}
