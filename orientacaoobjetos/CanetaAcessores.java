package orientacaoobjetos;

public class CanetaAcessores {
	public String modelo;
	private double ponta;
	public String getModelo () {
		return this.modelo;
	}
	public void setModelo (String m) {
		this.modelo = m;
	}
	public double getPonta () {
		return this.ponta;
		
	}
	public void setPonta (double p) {
		this.ponta = p;
	}
	public void status () {
		System.out.println("SOBRE A CANETA");
		// ("Modelo: " + this.modelo); MESMA COISA
		System.out.println("Modelo: " + this.getModelo ());
		System.out.println("Ponta: " + this.getPonta ());
	}
	
}
