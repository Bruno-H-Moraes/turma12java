programa
{
	/*
	 * 2-  	O IMC – Índice de Massa Corporal é um critério da Organização Mundial de Saúde para dar uma indicação 
	 * sobre a condição de peso de uma pessoa adulta. A fórmula é IMC = peso / ( altura )2
Elabore um programa que leia o peso e a altura de um adulto e mostre sua condição de acordo com a tabela abaixo.
IMC em adultos Condição
Abaixo de 18,5 Abaixo do peso
Entre 18,5 e 25 Peso normal
Entre 25 e 30 Acima do peso
Acima de 30 obeso

	 */
	cadeia nome
	real peso, altura
	real imc
	funcao inicio()
	{
		escreva("Para iniciar, digite o seu nome: ")
		leia(nome)
		escreva("\nOlá, ",nome,", qual é o seu peso? ")
		leia(peso)
		escreva("\nAgora digite a sua altura: ")
		leia (altura)

		imc = peso / (altura**2)

		se(imc < 18.5){
			escreva("Você está abaixo do peso")
		} se(imc >= 18.5 e imc < 25){
			escreva("Você está no peso normal.")
		}se(imc >= 25 e imc < 30){
			escreva("Você esta acima do peso")
		}se (imc > 30){
			escreva("Voce está obeso")
		}

		 
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 0; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */