package Banco;

import java.util.Scanner;

public class CadConta {
	public static void main(String[] args) {
	//variaveis e objetos
	Scanner leia = new Scanner(System.in);
	char opcao;
			
	
	
	System.out.println("EDBANK [BANCO MULTIPLO]");
	System.out.println();
	System.out.println("Escolha:");
	System.out.println("1 - Conta Poupan�a");
	System.out.println("2 - Conta Corrente");
	System.out.println("3 - Conta Especial");
	System.out.println("4 - Conta Empresa ");
	System.out.print("Digite o numero de sua op��o: ");
	opcao = leia.next().charAt(0);
	
	if (opcao == '1')
	{
		int data, numeroConta, diaHoje;
		double movimento;
		char tipoMovimento;
		System.out.println("Digite o numero da conta poupan�a: ");
		numeroConta = leia.nextInt();
		System.out.println("Digite o dia de anivers�rio mensal da conta:");
		data = leia.nextInt();
		ContaPoupanca cp1 = new ContaPoupanca(numeroConta,data);
		System.out.println();
		System.out.println("NUMERO DA CONTA: "+numeroConta);
		
		for (int x = 1; x<=5; x++)
		{
			System.out.println("Saldo atual: "+cp1.getSaldo());
			System.out.println("Movimento "+x);
			System.out.print("Debito ou Credito [D/C]:");
			tipoMovimento = leia.next().toUpperCase().charAt(0);
			if (tipoMovimento =='D' && cp1.getSaldo() > 0)
			{
								
				System.out.print("Digite o valor do d�bito: ");
				movimento = leia.nextDouble();
				while (movimento > cp1.getSaldo()) {
					System.out.print("Valor acima do saldo!!! Digite de novo: ");
					movimento = leia.nextDouble();
				}
				cp1.debitar(movimento);
				
				
			}
			else if (tipoMovimento =='C')
			{
				System.out.print("Digite o valor do cr�dito: ");
				movimento = leia.nextDouble();
				cp1.creditar(movimento);
			}
			else
			{
				System.out.println("OP��O INVALIDA!!!");
			}
		}
		System.out.println("Saldo atual:"+cp1.getSaldo());
		System.out.print("Digite o dia de hoje (apenas o dia):");
		diaHoje = leia.nextInt();
		if (diaHoje == data) {
			cp1.correcao(diaHoje);
			System.out.println("Novo saldo ap�s corre��o:"+cp1.getSaldo());
		}
		
	}
	else if (opcao == '2')
	{
		
	}
	else if (opcao == '3')
	{
		
	}
	else if (opcao == '4')
	{
		
	}
	}
}
