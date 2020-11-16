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
			
			System.out.printf("Olá Sr(a) %s, agora digite sua conta: ", nome);
			numeroConta = read.nextDouble();
			
			System.out.print("==================================");	
			System.out.print("  Bem vindo ao banco do ED!  ");
			System.out.print("==================================");
			//leitura menu principal
			System.out.print("\n1 - Conta Corrente.");
			System.out.print("\n2 - Conta Poupança.");
			System.out.print("\n3 - Conta Especial");
			System.out.print("\n4 - Conta Empresarial");
			System.out.print("\nSelecione o número da opção desejada: ");
			menuOpcao = read.nextInt();
			
			//Conta Corrente
			if(menuOpcao==1)
			{
				System.out.print("Boa tarde "+nome+" você está em conta corrente!");
				System.out.print("\nSaldo até o momento: "+saldo);
				
				do {
					contador++;
					System.out.println("\nMovimentação "+contador+"º de 10 para o dia.");
					
					System.out.println("Qual movimentação deseja fazer? C - Credito ou D - Debito.");
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
					
					
					System.out.println("DESEJA FAZER OUTRA MOVIMENTAÇÃO? ");
					resposta1= read.next();
				}while(contador<10 && resposta1=="SIM");
				
				
				
			}
			
			//Conta Poupança
			if(menuOpcao==2)
			{
				System.out.print("Boa tarde "+nome+" você está em conta poupança!");
				System.out.print("\nSaldo até o momento: "+saldo);
				
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
			
			//Conta especial
			if(menuOpcao==3)
			{
				System.out.print("Boa tarde "+nome+" você está em conta especial!");
				System.out.print("Saldo até o momento: "+saldo);
				
				do {
					contador++;
					System.out.println("Movimentação "+contador+"º de 10 para o dia.");
					
					System.out.println("Qual movimentação deseja fazer? C - Credito ou D - Debito.");
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
					
					
					System.out.println("DESEJA FAZER OUTRA MOVIMENTAÇÃO? ");
					resposta1= read.next();
				}while(contador<10 && resposta1=="SIM");
				
				
				
			}
			
			//Conta Empresarial
			if(menuOpcao==4)
			{
				System.out.print("Boa tarde "+nome+" você está em conta empresarial!");
				System.out.print("Saldo até o momento: "+saldo);
				
				do {
					contador++;
					System.out.println("Movimentação "+contador+"º de 10 para o dia.");
					
					System.out.println("Qual movimentação deseja fazer? C - Credito ou D - Debito.");
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
					
					
					System.out.println("DESEJA FAZER OUTRA MOVIMENTAÇÃO? ");
					resposta1= read.next();
				}while(contador<10 && resposta1=="SIM");
				
				
				
				
			}
			
			
			
			contador++;
			System.out.println("Movimentação "+contador+"º de 10 para o dia.");
			
			System.out.println("Qual movimentação deseja fazer? C - Credito ou D - Debito.");
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
			
			
			System.out.println("DESEJA FAZER OUTRA MOVIMENTAÇÃO? ");
			resposta1= read.next();
		}while(contador<10 && resposta1=="SIM");
	}
}
		
		
		
		
		
		
			
		
		
		
		
		
		
		
	


