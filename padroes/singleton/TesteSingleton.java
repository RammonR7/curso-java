package padroes.singleton;

public class TesteSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1 = Singleton.getInstancia();
		Singleton s2 = Singleton.getInstancia();
		Singleton s3 = Singleton.getInstancia();
		
		// Original
		System.out.println(s1.texto);
		
		// LowerCase deixa as letras min�sculas
		s1.texto = s1.texto.toLowerCase();
		
		System.out.println(s1.texto);
		System.out.println(s2.texto);
		
		//UpperCase deixa as letras MAI�SCULAS
		s1.texto = s1.texto.toUpperCase();
		
		System.out.println(s3.texto);
	}

}
