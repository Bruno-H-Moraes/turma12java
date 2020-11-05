programa
{
	inclua biblioteca Matematica --> mat 
	/*
	 * 1-  	Elabore um programa que calcule o que deve ser pago por um produto, 
	 * considerando o preço normal de etiqueta e a escolha da condição de pagamento. 
	 * Utilize os códigos da tabela a seguir para ler qual 
	 * a condição de pagamento escolhida e efetuar o cálculo adequado.
	Código Condição de pagamento
	1 À vista em dinheiro ou cheque, recebe 20% de desconto
	2 À vista no cartão de crédito, recebe 15% de desconto
	3 Em duas vezes, preço normal de etiqueta sem juros
	4 Em três vezes, preço normal de etiqueta mais juros de 10%

	 */

	 real produto = 0.0
	 inteiro pagamento 1, 2, 3, 4
	 real pagamentoVista = 0.0
	 
	funcao inicio()
	{
		escreva("Digite o valor do produto: ")
		leia(produto)

		escreva("Selecione a forma de pagamento: (1)Dinheiro ou cheque, (2) Cartão credito, (3)2x Sem juros, (4)3x com Juros: ")
		leia(pagamento)

		se(pagamento == 1){
			produto = produto - (produto * 0.20)
			escreva("O Valor do produto com desconto de 20% é: ", produto)
		}se (pagamento == 2){
			produto =  produto - (produto * 0.15)
			escreva("O valor do produto com desconto de 15% é: ", produto)
		}se (pagamento == 3){
			produto = produto / 2
			escreva("O valor do seu divido em duas vezes é,", produto," cada parcela")
		}se (pagamento == 4){
			produto = produto/3 + (produto * 0.10)  
			escreva("O valor do produto devido em 3x é de ",mat.arredondar(produto, 2)," adicionando 10% de juros")
		}se (pagamento > 5) {
			escreva("Opção inexistente")
		}
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1530; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */