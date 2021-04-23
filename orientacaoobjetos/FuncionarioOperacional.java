package orientacaoobjetos;


	public  class FuncionarioOperacional extends Funcionarios {
		private String setor;
		public FuncionarioOperacional (long cadastro, String nome, String ocupacao, double salario, String setor) {
			super (cadastro, nome, ocupacao, salario);
			this.setor = setor;
		}
		public String getSetor () {
			return this.setor;
		}
		public void setSetor (String setor) {
			this.setor = setor;
		}
		public 
		
}
