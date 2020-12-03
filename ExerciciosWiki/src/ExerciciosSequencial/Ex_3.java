package ExerciciosSequencial;

import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {
		//Faça um Programa que peça dois números e imprima a soma.
		
		Scanner leia = new Scanner (System.in);
		
		int num1 = 0;
		int num2 = 0;
		int result = 0;
		
		System.out.println("Digite o primeiro numero: ");
		num1 = leia.nextInt();
		
		System.out.println("Digite o segundo numero: ");
		num2 = leia.nextInt();
		
		result = num1 + num2;
		
		System.out.println(result);
		
		
		
		

	}

}
