package orientacaoobjetos;

public class TesteCaneta {

	public static void main(String[] args) {
		// INSTACIAR A CLASSE CANETA COM O OBEJTO c1
		Caneta c1 = new Caneta ();
		// REFER�NCIA A ATRIBUTO, SEM PAR�NTESES
			c1.cor = "Preta";
			c1.ponta = 0.5;
			c1.carga = 75;
			c1.tampada = false;
		// VAI MOSTRAR SEUS STATUS 
		// REFER�NCIA AO M�TODO, COM PAR�NTESES	
			c1.status();
		// PODE MODIFICAR PARA c1.rabiscar (); = "ERRO ! N�o estou rabiscando"	
			c1.destampar();
			c1.rabiscar();
			Caneta c2 = new Caneta ();
			c2.modelo = "Arpha";
			c2.cor = "Azul";
			c2.tampar ();
			c2.rabiscar();
			
		
		

	}

}
