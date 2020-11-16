package Desafio;

import java.util.Scanner;

public class DesafioBanco {

	public static void main(String[] args) {
Scanner read = new Scanner(System.in);
		
		double numeroConta=0;
		//final double agencia;
		double saldo=0;
		String cpf,  resposta1;
		char movimentacao;
		String cnpj;
		double mov[] = new double[10];
		int contador = 0;
		String nome;
		int menuOpcao;
		
		do
		{	
			System.out.println("Boa tarde, digite seu nome: ");
			nome = read.next();
			
			System.out.printf("Ol� Sr(a) %s, agora digite sua conta: ", nome);
			numeroConta = read.nextDouble();
			
			System.out.print("==================================");	
			System.out.print("  Bem vindo ao banco do ED!  ");
			System.out.print("==================================");
			//leitura menu principal
			System.out.print("\n1 - Conta Corrente.");
			System.out.print("\n2 - Conta Poupan�a.");
			System.out.print("\n3 - Conta Especial");
			System.out.print("\n4 - Conta Empresarial");
			System.out.print("\nSelecione o n�mero da op��o desejada: ");
			menuOpcao = read.nextInt();
			
			//Conta Corrente
			if(menuOpcao==1)
			{
				System.out.print("Boa tarde "+nome+" voc� est� em conta corrente!");
				System.out.print("\nSaldo at� o momento: "+saldo);
				
				do {
					contador++;
					System.out.println("\nMovimenta��o "+contador+"� de 10 para o dia.");
					
					System.out.println("Qual movimenta��o deseja fazer? C - Credito ou D - Debito.");
					movimentacao= read.next().toUpperCase().charAt(0);
					
					if (movimentacao=='C')
					{
						System.out.println("Entre com o valor que deseja depositar: ");
						mov[contador]= read.nextDouble();
						saldo = saldo + mov[contador];
					}
					else if (movimentacao=='D')
					{
						System.out.println("Entre com o valor que deseja retirar: ");
						mov[contador]= read.nextDouble();
						saldo = saldo - mov[contador];
					}
					else
					{
						System.out.println("ERROR!!! Entre com  C - Credito ou D - Debito. ");
					}
					
					
					System.out.println("DESEJA FAZER OUTRA MOVIMENTA��O? ");
					resposta1= read.next();
				}while(contador<10 && resposta1=="SIM");
				
				
				
			}
			
			//Conta Poupan�a
			if(menuOpcao==2)
			{
				System.out.print("Boa tarde "+nome+" voc� est� em conta poupan�a!");
				System.out.print("\nSaldo at� o momento: "+saldo);
				
				do {
					contador++;
					System.out.println("\nMovimenta��o "+contador+"� de 10 para o dia.");
					
					System.out.println("\nQual movimenta��o deseja fazer? C - Credito ou D - Debito.");
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
					
					
					System.out.println("DESEJA FAZER OUTRA MOVIMENTA��O? ");
					resposta1= read.next();
				}while(contador<10 && resposta1=="SIM");
				
				
				
				
			}
			
			//Conta especial
			if(menuOpcao==3)
			{
				System.out.print("Boa tarde "+nome+" voc� est� em conta especial!");
				System.out.print("Saldo at� o momento: "+saldo);
				
				do {
					contador++;
					System.out.println("Movimenta��o "+contador+"� de 10 para o dia.");
					
					System.out.println("Qual movimenta��o deseja fazer? C - Credito ou D - Debito.");
					movimentacao= read.next().toUpperCase().charAt(0);
					
					if (movimentacao=='C')
					{
						System.out.println("Entre com o valor que deseja depositar: ");
						mov[contador]= read.nextDouble();
						saldo = saldo + mov[contador];
					}
					else if (movimentacao=='D')
					{
						System.out.println("Entre com o valor que deseja retirar: ");
						mov[contador]= read.nextDouble();
						saldo = saldo - mov[contador];
					}
					else
					{
						System.out.println("ERROR!!! Entre com  C - Credito ou D - Debito. ");
					}
					
					
					System.out.println("DESEJA FAZER OUTRA MOVIMENTA��O? ");
					resposta1= read.next();
				}while(contador<10 && resposta1=="SIM");
				
				
				
			}
			
			//Conta Empresarial
			if(menuOpcao==4)
			{
				System.out.print("Boa tarde "+nome+" voc� est� em conta empresarial!");
				System.out.print("Saldo at� o momento: "+saldo);
				
				do {
					contador++;
					System.out.println("Movimenta��o "+contador+"� de 10 para o dia.");
					
					System.out.println("Qual movimenta��o deseja fazer? C - Credito ou D - Debito.");
					movimentacao= read.next().toUpperCase().charAt(0);
					
					if (movimentacao=='C')
					{
						System.out.println("Entre com o valor que deseja depositar: ");
						mov[contador]= read.nextDouble();
						saldo = saldo + mov[contador];
					}
					else if (movimentacao=='D')
					{
						System.out.println("Entre com o valor que deseja retirar: ");
						mov[contador]= read.nextDouble();
						saldo = saldo - mov[contador];
					}
					else
					{
						System.out.println("ERROR!!! Entre com  C - Credito ou D - Debito. ");
					}
					
					
					System.out.println("DESEJA FAZER OUTRA MOVIMENTA��O? ");
					resposta1= read.next();
				}while(contador<10 && resposta1=="SIM");
				
				
				
				
			}
			
			
			
			contador++;
			System.out.println("Movimenta��o "+contador+"� de 10 para o dia.");
			
			System.out.println("Qual movimenta��o deseja fazer? C - Credito ou D - Debito.");
			movimentacao= read.next().toUpperCase().charAt(0);
			
			if (movimentacao=='C')
			{
				System.out.println("Entre com o valor que deseja depositar: ");
				mov[contador]= read.nextDouble();
				saldo = saldo + mov[contador];
			}
			else if (movimentacao=='D')
			{
				System.out.println("Entre com o valor que deseja retirar: ");
				mov[contador]= read.nextDouble();
				saldo = saldo - mov[contador];
			}
			else
			{
				System.out.println("ERROR!!! Entre com  C - Credito ou D - Debito. ");
			}
			
			
			System.out.println("DESEJA FAZER OUTRA MOVIMENTA��O? ");
			resposta1= read.next();
		}while(contador<10 && resposta1=="SIM");
	}
}
		
		
		
		
		
		
			
		
		
		
		
		
		
		
	


