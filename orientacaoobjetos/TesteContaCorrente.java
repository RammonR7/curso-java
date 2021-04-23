package orientacaoobjetos;

public class TesteContaCorrente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContaCorrente a1 = new ContaCorrente ();
		a1.setNum(2345);
		a1.abrirConta("Conta Corrente");
		a1.depositar(20);
		a1.estadoConta ();
		a1.sacar(70);
		a1.fecharConta();
		
		ContaCorrente a2 = new ContaCorrente ();
		a2.setNum(2347);
		a2.abrirConta ("Conta Poupança");
		a2.depositar(50);
		a2.estadoConta();

	}

}
