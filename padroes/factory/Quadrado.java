package padroes.factory;

public class Quadrado implements Geometria {
	
	public String CalculaPerimetro(int lado) {
		return "O per�metro do quadrado vale " +lado*4;
	}
	
	public String CalculaArea(int lado) {
		return "A �rea do quadrado vale " +Math.pow(lado, 2);
	}

}
