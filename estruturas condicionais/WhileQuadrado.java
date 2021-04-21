package estruturascondicionais.java;

import java.util.Scanner;

public class WhileQuadrado {

	public static void main(String[] args) {
// Leitor		
		Scanner reader = new Scanner (System.in);
        boolean flag = true;
        while (flag) {
// Digite qualquer numero para elevar ao quadrado e zero para finalizar o programa            
        System.out.println("Enter any number to square and zero to end the program.");
        int number = reader.nextInt();
        if (number == 0) 
        flag = false;
        else
        System.out.println (number * number);
        
            }
// Programa encerrado            
            System.out.println ("Program closed");
    }

	}

