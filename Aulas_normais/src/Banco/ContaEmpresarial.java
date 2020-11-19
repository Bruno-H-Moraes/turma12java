package Banco;
//atributo
public class ContaEmpresarial extends Conta{
	private double emprestimo;
	
	
	
	//construtor
	public ContaEmpresarial(int numero, String cpf_cnpj) {
		super(numero, cpf_cnpj);
		
	}




	public double getEmprestimo() {
		return emprestimo;
	}




	public void setEmprestimo(double emprestimo) {
		this.emprestimo = emprestimo;
	}

		//metodos
	
	public void pedirEmprestimo(double valorEmprestimo) {
		
		if (valorEmprestimo <= this.emprestimo ) {
			super.creditar(valorEmprestimo);
			this.emprestimo -= valorEmprestimo;
			
		}
		
	}
	

}
