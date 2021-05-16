package padroes.builder;

public class Matricula {
	
	private long cadastro;
	private Responsavel responsavel;
	private Aluno aluno;
	
	public long getCadastro() {
		return cadastro;
	}
	
	public void setCadastro(long cadastro) {
		this.cadastro = cadastro;
	}
	
	public Responsavel getResponsavel() {
		return responsavel;
	}
	
	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	
	public Aluno getAluno() {
		return aluno;
	}
	
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	
	public String toString() {
		return "--------------"
				+"\n#   Matrícula Aluno   #"
				+"\n-----------------------"
				+"\ncadastro:" + cadastro
				+"\naluno:" + aluno.getNome()
				+"\nserie:" + aluno.getSerie()
				+"\nturno:" + aluno.getTurno()
				+"\n-------------------------"
				+"\nresponsável " +responsavel.getNome()
				+"\nendereço " +responsavel.getEndereco()
				+"\ntelefone " +responsavel.getTelefone();
	}
}
