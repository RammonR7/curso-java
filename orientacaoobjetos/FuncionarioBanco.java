package orientacaoobjetos;



public class FuncionarioBanco {
String nome;
String localTrabalho;
double salario;
String dataEntrada;
String rg;
boolean trabalho;
void mostrar () {
	System.out.println("Nome: " + this.nome);
	System.out.println("Local de trabalho: " + this.localTrabalho);
	System.out.println("Salário: " + salario);
	System.out.println("Começo de trabalho: " + dataEntrada);
	System.out.println("Registro geral: " + this.rg);
	System.out.println("Merece: " + this.trabalho);
}
void demitir () {
	
}
	
}

