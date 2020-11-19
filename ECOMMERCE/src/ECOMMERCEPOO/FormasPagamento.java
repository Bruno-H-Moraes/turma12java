package ECOMMERCEPOO;

public class FormasPagamento {
	
	private int vista = 1;
	private int vistaC = 2;
	private int parcelado2 = 3;
	private int parcelado3 = 4;
	private double totalCompras = 0;
	private int formasPag = 0;
	
	
	
	
	
	public int getVista() {
		return vista;
	}
	public void setVista(int vista) {
		this.vista = vista;
	}
	public int getVistaC() {
		return vistaC;
	}
	public void setVistaC(int vistaC) {
		this.vistaC = vistaC;
	}
	public int getParcelado2() {
		return parcelado2;
	}
	public void setParcelado2(int parcelado2) {
		this.parcelado2 = parcelado2;
	}
	public int getParcelado3() {
		return parcelado3;
	}
	public void setParcelado3(int parcelado3) {
		this.parcelado3 = parcelado3;
	}
	
	
	public void FormasPagamentos() {
		if(formasPag == 1) {
			totalCompras = (totalCompras - (totalCompras * 0.20));
			System.out.println("O valor total da compra com 20% de desconto: "+ totalCompras);
		}else if(formasPag == 2) {
			totalCompras = (totalCompras - (totalCompras * 0.15 ));
			System.out.println("O valor total de compra com 15% de desconto: "+totalCompras);
		}else if(formasPag == 3) {
			totalCompras = totalCompras / 2;
			System.out.println("O valor de cada parcela é de: "+ totalCompras);
		}else if(formasPag == 4) {
			totalCompras = totalCompras + (totalCompras * 0.10) / 3;
			System.out.println("O total das parcelas com mais 10% de juros é: " + totalCompras );
		}else {
			System.out.println("Opção Invalida.");
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
