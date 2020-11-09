package Exercicios_Lista1;

import java.util.Scanner;

public class Exercicio2 {
	public static void main (String args[]) {
		
Scanner leia = new Scanner(System.in);
		
		int idade_dias, idade_anos, idade_meses ;
		
	System.out.println("Entre com sua idade em dias: ");
	idade_dias = leia.nextInt();
	
	idade_anos = idade_dias /365;
	idade_meses = idade_dias /12;
		
		System.out.println("Sua idade em dias é: " + idade_dias);
		System.out.println("Sua idade em anos é: " + idade_anos);
		System.out.println("Sua idade em meses é: " + idade_meses);
		
		
	}
}
