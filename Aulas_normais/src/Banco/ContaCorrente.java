package Banco;

public class ContaCorrente extends Conta {
	
	private int numeroTalao;
	
	public ContaCorrente(int numero) {
		super(numero);
		
	}
	public int getNumeroTalao() {
		return numeroTalao;
	}
	public void setNumeroTalao(int numeroTalao) {
		this.numeroTalao = numeroTalao;
	}
	
	
	public void emitirTalao() {
		
		this.numeroTalao = this.numeroTalao+1;
	}
	public void emitirTalao(int numeroDeTaloes) {
		this.numeroTalao += numeroDeTaloes;
	}
	
	
	
}