package orientacaoobjetos;

public class Conta {
   int number;
   String name;
 // Saldo  
   double balance;
   double limit;
// Saca Quantidade  
 void toWithdraw (double theamount) {
	 this.balance = this.balance - theamount;
     return;
 }
   	
   	void deposit (double theamount) {
   		this.balance += theamount;
   	}
   
}
