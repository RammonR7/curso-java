package orientacaoobjetos;

public class TesteCanetaAcessores {

	public static void main(String[] args) {
		CanetaAcessores a = new CanetaAcessores ();
		// N�O DAR ERRO E � A MESMA COISA SE UTILIZAR, MAS UTILIZOU DE FORMA DIRETA DE ACESSO a.modelo = "Cristal";
		a.setModelo ("Cristal");
		a.setPonta (0.5);
		a.status ();
		
		

	}

}
