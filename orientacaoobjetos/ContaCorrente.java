package orientacaoobjetos;

public class ContaCorrente {
public int num;
protected String tipo;
private String nomeconta;
private double saldoconta;
private boolean statusconta;
public void estadoConta () {
	System.out.println("Conta" + this.getNum());
	System.out.println("Tipo" + this.getTipo());
	System.out.println("Saldo" + this.getSaldoconta());
	System.out.println("Status" + this.getStatusconta());
}
public void abrirConta (String t) {
	this.setTipo (t);
	this.setStatusconta (true);
	if (t == "Conta Corrente") {
		this.setSaldoconta (50);
	}
	else if (t == "Conta Poupança") {
			this.setSaldoconta (150);
		}
	System.out.println("Conta aberta com sucesso");
	}
public void fecharConta () {
	if (this.getSaldoconta() > 0) {
		System.out.println("Conta não pode ser fechada porque ainda tem dinheiro");
	}
	else if (this.getSaldoconta() < 0) {
		System.out.println("Conta não pode ser fechada pois tem débito");
	}
	else {
		this.setStatusconta (false);  
		System.out.println("Conta fechada com sucesso");
	}
}
public void depositar (double d) {
	if (this.getStatusconta()) {
		this.setSaldoconta (this.getSaldoconta () + d); 
		System.out.println("Depósito realizado na conta de " + this.getNomeconta ());
	}
	else {
		System.out.println("Impossível depositar em uma conta fechada");
	}
}
public void sacar (double v) {
	if (this.getStatusconta ()) {
		if (this.getSaldoconta() >= v) {
			this.setSaldoconta (getSaldoconta () - v);
			System.out.println("Saque realizado na conta de " + this.getNomeconta());
			
		}
		else {
			System.out.println("Impossível sacar de uma conta fechada");
		}
	}
	
}
public void pagarmensal () {
	int v = 0;
	if (this.getTipo() == "Conta Corrente") {
		v = 12;
	}
	else if (this.getTipo() == "Conta Poupança") {
		v = 20;		
	}
	if (this.getStatusconta()) {
		this.setSaldoconta (this.getSaldoconta() - v);
		System.out.println("Mensalidade paga com sucesso por " + this.getNomeconta());
	}
	else {
		System.out.println("Impossível pagar uma conta");
	}
}
public ContaCorrente () {
	this.saldoconta = 0;
	this.statusconta = false;
	
}
public void setNum (int n) {
	this.num = n;
}
public int getNum () {
   return this.num;
}
public void setTipo (String t) {
	this.tipo = t;
}
public String getTipo () {
	return this.tipo;
}
public void setNomeonta (String nc) {
	this.nomeconta = nc;
}
public String getNomeconta () {
	return nomeconta;
}
public void setSaldoconta (double sc) {
	this.saldoconta = sc;
}
public double getSaldoconta () {
	return saldoconta;
}
public void setStatusconta (boolean stc) {
	this.statusconta = stc;
}
public boolean getStatusconta () {
	return statusconta;
}


}
