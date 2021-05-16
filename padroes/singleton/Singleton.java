package padroes.singleton;

public class Singleton {
	private static Singleton singleton;
	
	String texto;
	
	private Singleton() {
		texto = "jAvA cUrSo";
	}
	public static Singleton getInstancia() {
		
	
	if(singleton == null) {
		singleton = new Singleton();
	}
	return singleton;
	
}	
}


