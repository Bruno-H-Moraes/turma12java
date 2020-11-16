package Desafio;

import java.util.Scanner;

public class bancoFinal{
	public static void main(String args[]) {
		
		
	     Scanner read = new Scanner(System.in);
	        
	        double numeroConta;
	        //final double agencia;
	        double saldo = 0, saldoLimite=3000.0, pergunta2, auxiliar;
	        String cpf, nome;
	        char movimentacao = 0,  resposta1;
	        String cnpj;
	        double mov[] = new double[10];
	        int contador = 0;   
	        int menuOpcao;
	        double valorEmprestimo = 10000;
	        double emprestimo = 0;
	        //conta corrente
	        char talaodeCheque;
	        double saldoContaCorrente= 2000;
	        double quantiaAsacar=0;
	        int quantidadeTalao=0;
	        double credito, debito; 
	        int numeroDoTalao=1;
	        //poupanca
	        double saldoPoupa = 0;
	        int niver = 0;
	        
	        
	        
	        
	        
	        
	        
	        
	        do
	        {   
	            System.out.println("Boa tarde, digite seu nome: ");
	            nome = read.next();
	            
	            System.out.printf("Olá Sr(a) %s, agora digite sua conta: ", nome);
	            numeroConta = read.nextDouble();
	            
	            System.out.print("==================================");   
	            System.out.print("  Bem vindo ao banco G3!  ");
	            System.out.print("==================================");
	            //leitura menu principal
	            System.out.print("\n1 - Conta Corrente.");
	            System.out.print("\n2 - Conta Poupança.");
	            System.out.print("\n3 - Conta Especial");
	            System.out.print("\n4 - Conta Empresarial");
	            System.out.print("\nSelecione o número da opção desejada: ");
	            menuOpcao = read.nextInt();
	            
	            if(menuOpcao==1)
	            { 
	                System.out.print("Boa tarde "+nome+" você está em conta corrente!");
	                System.out.print("Saldo até o momento: "+saldoContaCorrente);
	                
	                do {
	                    contador++;
	                    System.out.println("Movimentação "+contador+"º de 10 para o dia.");
	                    
	                    System.out.println("Qual movimentação deseja fazer? C - Credito ou D - Debito.");
	                    movimentacao= read.next().toUpperCase().charAt(0);
	                    
	                    if (movimentacao=='C')
	                    {
	                        System.out.println("Entre com o valor que deseja depositar: ");
	                        credito= read.nextDouble();
	                        saldoContaCorrente=saldoContaCorrente+credito;
	                    }
	                    else if (movimentacao=='D')
	                    {
	                        System.out.println("Entre com o valor que deseja retirar: ");
	                        debito = read.nextDouble();
	                        saldoContaCorrente=saldoContaCorrente-debito;
	                    }
	                    else
	                    {
	                        System.out.println("ERROR!!! Entre com  C - Credito ou D - Debito. ");
	                        contador=contador-1;
	                    }
	                    
	                    
	                    System.out.println("DESEJA FAZER OUTRA MOVIMENTAÇÃO? ");
	                    resposta1=  read.next().toUpperCase().charAt(0);
	                }while(contador<10 && resposta1=='S');
	            
	                
	                    
	                //tem saldo na conta?
	                    if (saldoContaCorrente<0)
	                    {
	                        saldoContaCorrente=0.0;
	                        System.out.print("Saldo Insuficiente!");
	                        
	                    }
	                        //há saldo na conta?
	                    if (saldoContaCorrente>=quantiaAsacar)
	                    {
	                        System.out.println("O saldo atual: "+saldoContaCorrente);
	                        saldoContaCorrente-=quantiaAsacar;
	                        
	                    }
	                    //caso não tenha saldo na conta
	                    else
	                    {
	                        System.out.println();
	                    }
	                        System.out.println("Deseja um talão de cheque S/N");
	                        talaodeCheque=read.next().toUpperCase().charAt(0);
	                    if (talaodeCheque=='S')
	                    {
	                        System.out.println("Quantos talões deseja adquirir?");
	                        quantidadeTalao = read.nextInt();
	                        //talaodeCheque=talaodeCheque+quantidadeTalao;
	                        for (int x=1;x<=quantidadeTalao;x++)
	                        {
	                            System.out.println("Novo talão de cheque: "+numeroDoTalao);
	                            numeroDoTalao++;
	                        }
	                    }
	            
	                    else
	                    {
	                        System.out.println("Você não adiquiriu nenhum talão.");
	                    }
	                    
	                }
	            
	            //MENU CONTA POUPANÇA
	            if(menuOpcao==2)
	            	
	            { 
	                System.out.print("Boa tarde "+nome+" você está em conta poupança!");
	                System.out.print("Saldo até o momento: "+saldo);
	                
	            }
	            if (movimentacao=='C')
                {
                    System.out.println("Entre com o valor que deseja depositar: ");
                    credito= read.nextDouble();
                    saldoPoupa=saldoPoupa+credito;
                }
                else if (movimentacao=='D')
                {
                    System.out.println("Entre com o valor que deseja retirar: ");
                    debito = read.nextDouble();
                    saldoPoupa=saldoPoupa-debito;
                }
                else
                {
                    System.out.println("ERROR!!! Entre com  C - Credito ou D - Debito. ");
                    contador=contador-1;
                }
	            System.out.println("Digite a data de hoje(Ex: Se for dia 10 do mes 11, digitar 1011:");
	            niver = read.nextInt();
	            
	            if(niver == 1311) {
	            	System.out.println("Hoje é o dia do aniversario da sua conta! Você recebera 0.5% de saldo de bonus");
	            	saldoPoupa = saldoPoupa + (saldoPoupa * 0.05);
	            }
	            
	            
	            
	            
	            //Conta especial
	            if(menuOpcao==3)
	            { 
	                System.out.print("Boa tarde "+nome+" você está em conta especial!");
	                System.out.print("Saldo até o momento: "+saldo);
	                
	                char pergunta;
	                do
	                {
	                    contador++;
	                    System.out.println("Movimentação "+contador+"º de 10 para o dia.");
	                    System.out.println("Nesse momento o saldo de sua conta é de R$:"+saldo);
	                    System.out.println("E o limite especial de sua conta é de R$:"+saldoLimite);
	                    
	                    System.out.println("Qual movimentação deseja fazer? C - Credito ou D - Debito.");
	                    movimentacao= read.next().toUpperCase().charAt(0);
	                    
	                    while ((movimentacao!='C') & (movimentacao!='D'))
	                    {
	                        System.out.println("ERROR!!! Entre coma letra correta.");
	                        System.out.println("Qual movimentação deseja fazer? C - Credito ou D - Debito.");
	                        movimentacao=read.next().toUpperCase().charAt(0);
	                    }
	                    
	                    if (movimentacao=='C')
	                    {
	                        System.out.println("Entre com o valor que deseja depositar: ");
	                        mov[contador-1]= read.nextDouble();
	                        saldo=saldo+mov[contador-1];
	                    }
	                    else
	                    {
	                        System.out.println("Entre com o valor que deseja retirar: ");
	                        mov[contador-1]= read.nextDouble();
	                        if(mov[contador-1]>saldo)
	                        {
	                            if(mov[contador-1]<=(saldo+saldoLimite))
	                            {
	                                System.out.println("Saldo da conta abaixo do valor solicitado. Deseja usar seu limite especial?: ");
	                                pergunta=read.next().toUpperCase().charAt(0);
	                    
	                                
	                                if (pergunta=='S')
	                                {
	                                    System.out.println("O que deseja fazer? T - Retirar todo limite, A - Abater somente o valor que falta, M - Retirar manualmente.");
	                                    pergunta=read.next().toUpperCase().charAt(0);
	                                    
	                                    while ((pergunta!='M') & (pergunta!='A') & (pergunta!='T'))
	                                    {
	                                        System.out.println("ERROR!!! Entre coma letra correta.");
	                                        System.out.println("O que deseja fazer? T - Retirar todo limite, A - Abater somente o valor que falta, M - Retirar manualmente.");
	                                        pergunta=read.next().toUpperCase().charAt(0);
	                                    }   
	                                    
	                                    if (pergunta=='T')
	                                    {
	                                        saldo=(saldo+saldoLimite);
	                                        saldo=(saldo-mov[contador-1]);
	                                        saldoLimite=(saldoLimite-saldoLimite);
	                                    }
	                                    else if (pergunta=='M')
	                                    {
	                                        System.out.println("Quanto deseja retirar do seu limite? Limite = R$"+saldoLimite+" Valor necessario para o debito = R$"+((mov[contador-1]-saldo)));
	                                        pergunta2=read.nextDouble();
	                                        while (pergunta2>saldoLimite || pergunta2<(mov[contador-1]+saldo))
	                                        {
	                                            System.out.println("ERROR!!! Valor solicitado acima do limite ou não cobre o valor necessario para o debito.");
	                                            System.out.println("Quanto deseja retirar do seu limite? Limite = R$"+saldoLimite+" Valor necessario para o debito = R$"+((mov[contador-1]-saldo)));
	                                            pergunta2=read.nextDouble();
	                                            
	                                        }           
	                                        saldo= ((saldo+pergunta2)-mov[contador-1]); 
	                                        saldoLimite=(saldoLimite-pergunta2);
	                                    }
	                                    else
	                                    {
	                                        saldoLimite=(saldoLimite-(mov[contador-1]-saldo));
	                                        saldo=0;
	                                    }
	                                }
	                            }
	                            else
	                            {
	                                System.out.println("Você não tem saldo suficiente e seu limite não cobre essa operação!");
	                            }
	                        }
	                        else
	                        {
	                            saldo=(saldo-mov[contador-1]);
	                        }
	                    }
	                    
	                    System.out.println("Movimentação "+contador+"º de 10 para o dia.");
	                    System.out.println("Nesse momento o saldo de sua conta é de R$:"+saldo);
	                    System.out.println("E o limite especial de sua conta é de R$:"+saldoLimite);
	                    
	                    System.out.println("DESEJA FAZER OUTRA MOVIMENTAÇÃO? ");
	                    pergunta=  read.next().toUpperCase().charAt(0);
	                    if(contador==10)
	                    {
	                        System.out.println("Você atingiu o limite de 10 movimentações diarias!");
	                    }
	                }while(contador<10 & pergunta=='S');
	                
	            }
	            
	            char pergunta;
	            
	            //Conta Empresarial
	            if(menuOpcao==4)
	            {   
	                System.out.println("\nSaldo até o momento é de: R$"+saldoContaCorrente);
	                System.out.println("\nVocê tem R$"+valorEmprestimo+" disponivel para emprestimo, digite o valor que deseja contratar: ");
	                emprestimo = read.nextDouble();
	            
	            if (emprestimo >=0)
	            {   
	                saldoContaCorrente = saldoContaCorrente + emprestimo;
	                valorEmprestimo = valorEmprestimo - emprestimo; 
	                System.out.println("\nSaldo atualizado é de: R$"+saldoContaCorrente);
	            }
	                
	                System.out.print("\nSaldo até o momento: "+saldoContaCorrente);
	                
	                do
	                    
	                {
	                    
	                    contador++;
	                    System.out.println("Movimentação "+contador+"º de 10 para o dia.");
	                    
	                    System.out.println("Qual movimentação deseja fazer? C - Credito ou D - Debito.");
	                    movimentacao= read.next().toUpperCase().charAt(0);
	                    
	                    if (movimentacao=='C')
	                    {
	                        System.out.println("Entre com o valor que deseja depositar: ");
	                        credito= read.nextDouble();
	                        saldoContaCorrente=saldoContaCorrente+credito;
	                    }
	                    else if (movimentacao=='D')
	                    {
	                        System.out.println("Entre com o valor que deseja retirar: ");
	                        debito = read.nextDouble();
	                        saldoContaCorrente=saldoContaCorrente-debito;
	                    }
	                    else
	                    {
	                        System.out.println("ERROR!!! Entre com  C - Credito ou D - Debito. ");
	                        contador=contador-1;
	                    }
	                    
	                    
	                    System.out.println("DESEJA FAZER OUTRA MOVIMENTAÇÃO? ");
	                    resposta1=  read.next().toUpperCase().charAt(0);
	                }while(contador<10 && resposta1=='S');
	            
	                
	                    
	                //tem saldo na conta?
	                    if (saldoContaCorrente<0)
	                    {
	                        saldoContaCorrente=0.0;
	                        System.out.print("Saldo Insuficiente!");
	                        
	                    }
	                        //há saldo na conta?
	                    if (saldoContaCorrente>=quantiaAsacar)
	                    {
	                        System.out.println("O saldo atual: "+saldoContaCorrente);
	                        saldoContaCorrente-=quantiaAsacar;
	                        
	                    }
	                    //caso não tenha saldo na conta
	                    else
	                    {
	                        System.out.println("Você não possui valor para essa transação!");
	                    }
	                    
	            }
	        }while(menuOpcao != 4);
	        {
	            System.out.println("Opção Invalida");
	        }
	    }
}
		
		
		
		
		
		
		
		
		
		
		
	


