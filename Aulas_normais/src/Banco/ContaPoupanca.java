package Banco;

public class ContaPoupanca  extends Conta
{
	//atributo
	private int dataAniversario;
	public ContaPoupanca(int numero, int dataAniversario) {
		super(numero);
		this.dataAniversario = dataAniversario;
	}
	//construtor
	public ContaPoupanca(int numero, String cpf_cnpj, int dataAniversario) {
		super(numero, cpf_cnpj);
		this.dataAniversario = dataAniversario;
	}
	//encapsulamento
	public int getDataAniversario() {
		return dataAniversario;
	}
	
	public void setDataAniversario(int dataAniversario) {
		this.dataAniversario = dataAniversario;
	}
	//metodo
	public void correcao(int data) {
		//saldo não pode ser vazio nem negativo
		//comparo a data de aniversário com a data informada se sim roda a correcao
		
		
		if(super.getSaldo()>0 && data == this.getDataAniversario()) {
			double novosaldo = 0.0;
		
			//correcao monetario: saldo + (saldo *0,5%) (saldo * 0.005)
			novosaldo = (super.getSaldo()*0.005);
			super.creditar(super.getSaldo());
			
		}
		
		
		
	}
}