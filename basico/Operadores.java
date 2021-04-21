package cursojava.basico;
/*
 * Classe de explicação e demonstração dos operadores
 * 
 * versão 1.0
 * 
 * autor:Rammon
 */
public class Operadores {

	public static void main(String[] args) {
		int n1 = 10, n2 = 20;
	    // Operadores aritméticos: + - * / %
		
		int resultado1 = n1 + n2;
		System.out.println(resultado1);
		
		int resultado2 = n1 - n2;
		System.out.println(resultado2);
		
		int resultado3 = n1 * n2;
		System.out.println(resultado3);
		
		double resultado4 = (double)n1 / n2;
		System.out.println(resultado4);
		
		int resultado5 = n1 % n2;
		System.out.println(resultado5);
		
		/*
		 * n1 = n1 + 1
		 * 
		 */
		System.out.println(n1++);
		System.out.println(n1);
		System.out.println(n1+=10);
		System.out.println(n1-=5);
		System.out.println(n1*=5);
		System.out.println(n1/=5);
		
		
	}

}
