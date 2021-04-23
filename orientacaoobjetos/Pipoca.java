package orientacaoobjetos;

public class Pipoca {
	public String cor;
	public String marca;
	public String sabor;
	private double preco = 3.10;
		public String getCor () {
			return this.cor;
		}
		public void setCor (String c) {
			this.cor = c;
		}
		public String getMarca () {
			return this.marca;
		}
		public void setMarca (String m) {
			this.marca = m;
		}
		public String getSabor () {
			return this.sabor;
		}
		public void setSabor (String s) {
			this.sabor = s;
		}
		public double getPreco () {
			return this.preco;
		}
		public void setPreco (double p) {
			this.preco = p;
		}
			void sabor () {
				if (sabor == "Salgado") {
					System.out.println("Não precisa colocar sal");
			}
				else if (sabor == "Doce") {
					System.out.println("Não precisa colocar açucar");
			}
				else {
					System.out.println("Precisa colocar sal ou açucar");
			}
		}
			void valor () {
				if (preco <= 3.20) {
					System.out.println("Tenho dinheiro");
				}
				else {
					System.out.println("Não tenho dinheiro");
				}
			}
}
