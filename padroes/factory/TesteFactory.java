package padroes.factory;

public class TesteFactory {

	public static void main(String[] args) {
		
		Geometria geo = new GeometriaFactory().calcular("QuadraDo");
		System.out.println(geo.CalculaArea(3));
		System.out.println(geo.CalculaPerimetro(3));
		
		Geometria geo1 = new GeometriaFactory().calcular("TriânguLo");
		System.out.println(geo1.CalculaArea(4));
		System.out.println(geo1.CalculaPerimetro(4));

	}

}
