package Lista_Ex_2;

import java.util.Scanner;

public class Exercicio_8 {
	public static void main(String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		/*
		 *  
8) Construa um sistema para ler uma vari�vel num�rica N e 
imprimi-la somente se a mesma for maior que 100,
 caso contr�rio imprimi-la com o valor zero.

		 */
		
		int N = 0;
				
		System.out.println("Entre com um valor: ");
		N = leia.nextInt();
		
		
		if(N < 100) {
			System.out.println("O valor digitado � 0");
		} else {
			System.out.println("O valor digitado �:" + N);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
