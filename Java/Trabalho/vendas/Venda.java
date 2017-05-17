package br.unipe.java.unidade3.vendas;

public class Venda {
	public Produto produto;
	public Vendedor vendedor;
	public double desconto;
	public int quantidadeItens;
	public double valor;

	public double calcularValor(){
	 valor= getQuantidadeItens()* (produto.getValorVenda() - efetuarDesconto());
	return valor;	
	}
	
	public double calcularComissao() {
		
		return 0;
		//comissao do vendedor e o valor da venda. Entretanto se o produto estiver em promocao o valor da comissão deve ser dividido por dois.


	}
	
	
	public double efetuarDesconto() {
		return 0;
	}
	
	public void imprimir() {
		
			}
	

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public int getQuantidadeItens() {
		return quantidadeItens;
	}

	public void setQuantidadeItens(int quantidadeItens) {
		this.quantidadeItens = quantidadeItens;
	}

}
