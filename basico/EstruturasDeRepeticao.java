package cursojava.basico;

import java.util.Scanner;

public class EstruturasDeRepeticao {

	public static void main(String[] args) {
		// CUIDADO NAS ESTRUTURAS DE REPETI��O � TER LIMITES, OU SEJA, LOOP DEFINIDO
		// DESTE JEITO TEREMOS UM LA�O INFINITO, MAS COM SCANNER HAVER� UM LOOP
		boolean flag = true;
		Scanner leitor = new Scanner (System.in);
			while (flag) {
				System.out.println("true");
					flag = leitor.nextBoolean();
		}
// LIMITE POR CONTADOR E SOMENTE APARECE QUANDO O FLAG FOR FALSE
		int contador = 0;
			while (contador < 10) {
				System.out.println(contador++);
// IMCREMENTOU 10 OU SEJA PR�-IMCREMENTO				
				System.out.println(++contador);
		}
			boolean flag_1 = false;
// PRIMEIRO EXECUTA E DEPOIS VERIFICA			
			do {
				System.out.println("Testando o Do-While");
			} 
			while (false); 
			}
	}


