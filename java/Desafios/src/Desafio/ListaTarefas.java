package Desafio;

import java.util.Scanner;

public class ListaTarefas {

	public static void main(String[] args) {
	Scanner leia = new Scanner(System.in);
	
	
	
	int calendario [][] = new int [5][31];
	int x = 0;
	int y= 0;
	
	for(x = 0; x < 31; x++) {
		for(y =0; y < 5; y++) {
	
		x = x + 1;
		y = y + 1;
		
		System.out.print(x + y);
		
		
		}
	}
	
	
	
	

	}

}
