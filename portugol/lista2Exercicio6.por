programa
{
	/*
	6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
Infantil A = 5 a 7 anos
Infantil B = 8 a 11 anos
Juvenil A = 12 a 13 anos
Juvenil B = 14 a 17 anos
Adultos = Maiores de 18 anos

	 */

	inteiro infantilA
	inteiro infantilB
	inteiro juvenilA
	inteiro juvenilB
	inteiro adultos
	inteiro idade
	 
	funcao inicio()
	{
		escreva("Digite a idade do nadador: ")
		leia(idade)


		se(idade<5){
			escreva("O nadador não tem idade suficiente")
		} se(idade < 7 ){
			escreva("O nadador é da classificação Intantil A")
		} se(idade < 11){
			escreva("O nadador é da classificação Infantil B")
		} se(idade < 13){
			escreva("O nadador é da classificação Juvenial A")
		} se(idade <17){
			escreva("A classificação do nadador é Juvenil B")
		} senao escreva("O nadador é da classificação Adulta")
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 515; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */