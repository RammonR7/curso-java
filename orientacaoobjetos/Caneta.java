package orientacaoobjetos;

public class Caneta {
	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	    void status () 		{
	    	System.out.println("Seu modelo � " + this.modelo);
	    	System.out.print("Uma caneta " + this.cor);
	    	System.out.println("Sua ponta � de " + this.ponta);
	    	System.out.println("Esta tampada ? " + this.tampada);
	    	
	    }
		void rabiscar () 	{
			if (this.tampada == true) {
				System.out.println("ERRO!! N�o posso rabiscar");
			}
			else {
				System.out.println("Estou rabiscando");
			}

		}
		void tampar () 	 	{
			this.tampada = true;
		
		}
		void destampar () 	{
			this.tampada = false;
	
		}
}