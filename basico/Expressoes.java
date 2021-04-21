package cursojava.basico;

public class Expressoes {

	public static void main(String[] args) {
		String java [] = {"José", "Maria", "João", "Carlos", "Jéssica", "Maiara"};
			java [1] = "Moisés";
			
				System.out.println(java[1]);
				System.out.println(java.length);
				System.out.println(java.toString());
				
		int matriz_1 [] [] = new int [3] [3];
		int matriz_2 [] [] = {{1,2,3}, {4,5,6}, {7,8,9}};
			matriz_1 = matriz_2;
			
				System.out.println(matriz_1 [2] [1]);
				
				int matriz_3 [] [] = new int [5] [3];
				int matriz_4 [] [] = {
						{1,2,3},
						{4,5,6},
						{7,8,9},
						{10,11,12},
						{13,14,15}
				};
				matriz_3 = matriz_4;
				for (int linhas [] : matriz_3) {
					for (int colunas : linhas) {
						System.out.print(colunas+ " ");
						
					}
				System.out.println();
				}

	}

}
