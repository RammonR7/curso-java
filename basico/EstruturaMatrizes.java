package cursojava.basico;

public class EstruturaMatrizes {

	public static void main(String[] args) {
		// DECLARANDO UMA MATRIZ 3X3 VAZIA
	
		
		// DECLARANDO UMA MATRIZ 3X3 JÁ INICIALIZADO SEUS VALORES
		int matriz [] [] = {{1,2,3},{4,5,6},{7,8,9}};
		
		// ATRIBUINDO OS VALORES DA SEGUNDA MATRIZ PARA A QUE ESTA VAZIA
		
		
		// PRIMEIRO FOR VAI PERCORRER AS LINHAS
		for (int i=0; i<matriz.length; i++) {
			// MATRIZ.LENGHT RETORNA QUANTAS LINHAS TEM A MATRIZ
			// SEGUNDO FOR VAI PERCORRER AS COLUNAS
			for (int j=0; j<matriz[i].length; j++) {
				// MATRIZ[I].LENGTH RETORNA QUANTAS COLUNAS TEM A LINHA
				System.out.print(matriz[i][j]+ " ");
			}
			// ESSE PRINT SERVE APENAS PARA PULAR PARA A PRÓXIMA LINHA
			System.out.println();
		}
		

	}

}
