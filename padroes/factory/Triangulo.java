package padroes.factory;

public class Triangulo implements Geometria {
	
	public String CalculaPerimetro(int lado) {
		return "O per�metro do tri�ngulo vale " +lado*3;
	}
	
	public String CalculaArea(int lado) {
		return "A �rea do tri�ngulo vale " +Math.pow(lado, 2)*Math.sqrt(3)/4;
	}

}
