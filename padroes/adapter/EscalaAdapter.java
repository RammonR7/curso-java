package padroes.adapter;

public class EscalaAdapter extends EscalaCelsius {
	public double getTemperatura() {
		return super.getTemperatura();
	}
	public void setTemperatura(double temperatura) {
		super.setTemperatura(temperatura);
	}
	public double getTemperaturaFahrenheight() {
		return(1.8*getTemperatura()+32);
	}
	public double getTemperaturaKelvin() {
		return(super.getTemperatura()+273);
	}

}
