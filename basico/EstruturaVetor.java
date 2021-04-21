package cursojava.basico;

public class EstruturaVetor {

	public static void main(String[] args) {
		// DECLARANDO O VETOR EM JAVA
		int vetor_1 [] = new int [10];
		
		// DECLARANDO E INICIALIZANDO O VETOR
		int vetor_2 [] = {1,2,3,4,5,6,7};
		
		// ATRIBUINDO VALORES AS POSIÇÕES DO VETOR
		vetor_1 [0] = 8;
		vetor_1 [1] = 16;
		vetor_1 [2] = 32;
		
		// SOBRESCREVENDO O VALOR DA TERCEIRA POSIÇÂO
		vetor_1 [2] = 64;
		
		// IMPRIMINDO OS VALORES DO VETOR
		System.out.println(vetor_1[0]);
		System.out.println(vetor_1[1]);
		System.out.println(vetor_1[2]);
		
		// VAI IMPRIMIR O VALOR 0 JÁ QUE NÃO FOI ATRIBUÍDO
		System.out.println(vetor_1[3]);
		
		for (int items: vetor_1) {
			System.out.println(items);
		}

	}

}
