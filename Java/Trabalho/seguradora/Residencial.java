package br.unipe.java.unidade3.vendas;

public class Residencial extends  Contrato{
	public String endereco;
	public String zonaImovel;
	public String tipoResidencia;
	public double seguro;
	public double seguroResidencial(float valorDoImovel,String zonaImovel,String tipoResidencia){
		seguro=0.02 * valorDoImovel;
		if(zonaImovel=="urbana"){
		seguro+=(seguro*0.01);
		}
		if(zonaImovel=="suburbana" || tipoResidencia=="casa"){
			seguro+=(seguro*0.5);
		}
		return seguro;
		}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getZonaImovel() {
		return zonaImovel;
	}
	public void setZonaImovel(String zonaImovel) {
		this.zonaImovel = zonaImovel;
	}
	public String getTipoResidencia() {
		return tipoResidencia;
	}
	public void setTipoResidencia(String tipoResidencia) {
		this.tipoResidencia = tipoResidencia;
	}

}
