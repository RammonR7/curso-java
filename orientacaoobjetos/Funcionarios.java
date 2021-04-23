package orientacaoobjetos;

public abstract class Funcionarios {
	private Long cadastro;
	String nome;
	private String ocupacao;
	private double salario;
	private static int numFuncionarios;

// Exemplo de construtor	
	public Funcionarios (long cadastro, String nome, String ocupacao, double salario) {
		this.cadastro = cadastro;
		this.nome = nome;
		this.ocupacao = ocupacao;
		this.salario = salario;
		this.numFuncionarios++;
	}
		public Long getCadastro () {
			return this.cadastro;
		}
	public void setCadastro (Long cadastro) {
		this.cadastro = cadastro;
	}
	public String getNome() {
		return nome;
	}
	public String getOcupacao() {
		return ocupacao;
	}
	public void setOcupacao(String ocupacao) {
		this.ocupacao = ocupacao;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
