package padroes.factory;

public class Triangulo implements Geometria {
	
	public String CalculaPerimetro(int lado) {
		return "O perímetro do triângulo vale " +lado*3;
	}
	
	public String CalculaArea(int lado) {
		return "A área do triângulo vale " +Math.pow(lado, 2)*Math.sqrt(3)/4;
	}

}
