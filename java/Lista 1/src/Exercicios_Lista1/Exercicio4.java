package Exercicios_Lista1;

import java.util.Scanner;

public class Exercicio4 {
	public static void main (String args[])
	{
	
	/*
	 * 4. Escreva  um sistema que leia três números inteiros e positivos 
	 * (A, B, C) e calcule a seguinte expressão: 

	 */
	
	Scanner leia = new Scanner(System.in);
	
	int A, B, C, Rs, R, Ss, S, D;
	
	System.out.println("Digite o valor de A: ");
	A = leia.nextInt();
	System.out.println("Digite o valor de B: ");
	B = leia.nextInt();
	System.out.println("Digite o valor de C: ");
	C = leia.nextInt();
	
	Rs = ((A + B));
	R = (int) Math.pow(Rs, 2);
	
	Ss = (B + C);
	S = (int)Math.pow(Ss, 2);
	
	D = ((R+S)/2);
	
	
	
	
	
	System.out.println("O valor de D é: " + D);
	
	
	
	
	}
}
