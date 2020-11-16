package Desafio;

import java.util.Scanner;

public class banco2 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		
		
		final double numeroConta;
		//final double agencia;
		double saldo = 0;
		String cpf,  resposta1;
		char movimentacao;
		String cnpj;
		double mov[] = new double[10];
		int contador = 0;
		int data = 0;
		
		//System.out.print("Boa tarde "+nome+" você está em conta poupança!");
		//System.out.print("\nSaldo até o momento: "+saldo);
		
		do {
			contador++;
			System.out.println("\nMovimentação "+contador+"º de 10 para o dia.");
			
			System.out.println("\nQual movimentação deseja fazer? C - Credito ou D - Debito.");
			movimentacao= read.next().toUpperCase().charAt(0);
			
			if (movimentacao=='C')
			{
				System.out.println("\nEntre com o valor que deseja depositar: ");
				mov[contador]= read.nextDouble();
				saldo = saldo + mov[contador];
			}
			else if (movimentacao=='D')
			{
				System.out.println("\nEntre com o valor que deseja retirar: ");
				mov[contador]= read.nextDouble();
				saldo = saldo - mov[contador];
			}
			else
			{
				System.out.println("\nERROR!!! Entre com  C - Credito ou D - Debito. ");
			}
			
			
			System.out.println("DESEJA FAZER OUTRA MOVIMENTAÇÃO? ");
			resposta1= read.next();
		}while(contador<10 && resposta1=="SIM");
		
		
	}
	

	
		}
		
	
	

