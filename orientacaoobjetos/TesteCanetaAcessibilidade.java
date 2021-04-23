package orientacaoobjetos;

public class TesteCanetaAcessibilidade {

	public static void main(String[] args) {
		CanetaAcessibilidade d1 = new CanetaAcessibilidade ();
		d1.modelo = "Rayovac";
		d1.cor = "Verde";
		//NÃO PODE COLOCAR PONTA POIS É PRIVATE E VAI DAR ERRO
		// d1.ponta = 0.5;
		d1.carga = 40;
		d1.tampada = true;
	    d1.status ();

	}

}
