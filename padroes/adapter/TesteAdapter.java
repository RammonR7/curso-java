package padroes.adapter;

public class TesteAdapter {

	public static void main(String[] args) {
		EscalaAdapter escala = new EscalaAdapter();
			escala.setTemperatura(32);
				System.out.println("Temperatura em *C:" +escala.getTemperatura());
				System.out.println("Temperatura em *F:" +escala.getTemperaturaFahrenheight());
				System.out.println("Temperatura em *K:" +escala.getTemperaturaKelvin());

	}

}
