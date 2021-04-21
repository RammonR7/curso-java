package cursojava.basico;

public class EstruturaRepeticaoFor {

	public static void main(String[] args) {
// SEMELHANTE AOS COMANDOS INT COM WHILE, MAS COM MENAS LINHAS DE CÓDIGO		
		for (int x =0; x < 10; x++) {
			System.out.println(x);
	}
	
		//String[] frutas = {"Maça","Abacaxi","Laranja", "Uva"};
		//for (int y = 0; y < 5; y++ ) {
			//System.out.println(frutas[y]);
//}
		for (String fruta : frutas) {
			System.out.println(frutas.toString(fruta));
		}
}
}
