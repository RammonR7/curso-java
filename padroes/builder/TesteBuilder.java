package padroes.builder;

public class TesteBuilder {

	public static void main(String[] args) {
		
		Matricula n1 = new MatriculaBuilder().setMatricula(12768)
						.setResponsavel("Maria", "Aveninda Mister Hull", "8598748-4848")
						.setAluno("Bezerra", "7* série", "Tarde")
						.build();
		
		System.out.println(n1.toString());

	}

}
