package orientacaoobjetos;

public class TesteFuncionario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// Quando vazio só colocar a linha de código em baixo		
		//Funcionarios f1 = new Funcionarios (1112, "João", "Analista de sistemas", 2000.0);
		FuncionarioOperacional f1 = new FuncionarioOperacional (1112, "João", "Analista de sistemas", 2000.0, "Vendas");
			//f1.setCadastro ((long) 1112);
			//f1.nome = ("João");
			//f1.setOcupacao("Analista de sistemas");
			//f1.setSalario(2000.0);
				System.out.println(f1.getCadastro());
				System.out.println(f1.getNome());
				System.out.println(f1.getOcupacao());
				System.out.println(f1.getSalario());
				System.out.println(f1.getSetor());

	}

}
