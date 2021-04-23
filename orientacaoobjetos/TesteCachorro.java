package orientacaoobjetos;

public class TesteCachorro {

	public static void main(String[] args) {
		Cachorro ch = new Cachorro ();
		ch.nome = "Rex";
		ch.cor = "Preto";
		ch.raca = "Dalmáta";
		ch.tamanho = 0.30;
		System.out.println (ch.nome);
		System.out.println (ch.cor);  
		System.out.println (ch.raca); 
		System.out.println (ch.tamanho);

	}

}
