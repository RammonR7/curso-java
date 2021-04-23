package orientacaoobjetos;

public class CanetaAcessibilidade {
	public String modelo;
	public String cor;
	private double ponta;
	protected int carga;
	protected boolean tampada;
	
	    void status () 		{
	    	System.out.println("Seu modelo é " + this.modelo);
	    	System.out.print("Uma caneta " + this.cor);
	    	System.out.println("Sua ponta é de " + this.ponta);
	    	System.out.println("Esta tampada ? " + this.tampada);
	    	
	    }
		public void rabiscar () 	{
			if (this.tampada == true) {
				System.out.println("ERRO!! Não posso rabiscar");
			}
			else {
				System.out.println("Estou rabiscando");
			}

		}
		protected void tampar () 	 	{
			this.tampada = true;
		
		}
		protected void destampar () 	{
			this.tampada = false;
	
		}
}
