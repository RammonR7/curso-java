package orientacaoobjetos;

public class TesteConta {

	public static void main(String[] args) {
		Conta minhaConta = new Conta ();
		minhaConta.name = "Duke";
		minhaConta.number = 7;
		minhaConta.balance = 1200.0;
		minhaConta.limit = 1500.0;
		minhaConta.toWithdraw(200);
		minhaConta.deposit(600);
		System.out.println("Saldo atual : " + minhaConta.balance);

	}

}
