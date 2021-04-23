package orientacaoobjetos;

public class Lutador {
	private String nome;
	private String nacionalidade;
	private int idade;
	private double altura;
	private double peso;
	private String categoria;
	private int vitoria;
	private int derrota;
	private int empate;
		public Lutador (String n, String nac, int id, double al, double pe, int vit, int der, int emp) {
			this.nome = n;
			this.nacionalidade = nac;
			this.idade = id;
			this.altura = al;
			this.peso = pe;
			this.vitoria = vit;
			this.derrota = der;
			this.empate = emp;
		}
		public String getNome () {
			return this.nome;
		}
		public void setNome (String n) {
			this.nome = n;
		}
		public String getNacionalidade () {
			return this.nacionalidade;
		}
		public void setNacionalidade (String nac) {
			this.nacionalidade = nac;
		}
		public int getIdade () {
			return this.idade;
		}
		public void setIdade (int id) {
			this.idade = id;
		}
		public double getAltura () {
			return this.altura;
		}
		public void setaltura (double al) {
			this.altura = al;
		}
		public double getpeso () {
			return this.peso;
		}
		public void setPeso (int pe) {
			this.peso = pe;
			this.setCategoria();
		}
		public String getCategoria () {
			return this.categoria;
		}
		private void setCategoria () {
			if (this.peso < 52.2) {
				this.categoria = "Inválido";
			}
			else if (this.peso <= 70.3) {
				this.categoria = "Leve";
			}
			else if (this.peso <= 83.3) {
				this.categoria = "Médio";
			}
			else if (this.peso <= 120.2) {
				this.categoria = "Pesado";
			}
			else {
				this.categoria = "Inválido";
			}
		}
		public int getVitoria () {
			return this.vitoria;
		}
		public void setVitoria (int vit) {
			this.vitoria = vit;
		}
		public int getDerrota () {
			return this.derrota;
		}
		public void setDerrota (int der) {
			this.derrota = der;
		}
		public int getEmpate () {
			return this.empate;
		}
		public void setEmpate (int emp) {
			this.empate = emp;
		}
		public void apresentar () {
			System.out.println("CHEGOU A HORA, ATENÇÃO!! Apresentamos o lutador: " +this.getNome());
			System.out.println("Diretamente de: " +this.getNacionalidade());
			System.out.println("Com " +this.getIdade() + "e com " +this.getAltura());
			System.out.println("Pesando " +this.getpeso() + "kg");
			System.out.println(this.getVitoria() + "vitórias");
			System.out.println(this.getDerrota() + "derrotas");
			System.out.println(this.getEmpate() + "empates");
		}
		public void status () {
			
		}
		public void ganharLuta () {
		this.setVitoria(getVitoria() + 1);
		
		}
		public void perderLuta () {
		this.setDerrota(getDerrota() + 1);	
		}
		public void empatarLuta () {
		this.setEmpate(getEmpate() + 1);	
		}
}
