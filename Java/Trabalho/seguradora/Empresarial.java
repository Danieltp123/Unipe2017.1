package br.unipe.java.unidade3.vendas;

public class Empresarial extends Contrato{
	public int numeroFuncionarios;
	public int numeroVisitas;
	public String ramo;
	public double seguro;
	public double seguroEmpresarial(float valorDoImovel,int numeroFuncionarios,int numeroVisitas,String ramo){
		seguro=0.04*valorDoImovel;
		if(numeroFuncionarios>=10){
			numeroFuncionarios=numeroFuncionarios/10;
			while(numeroFuncionarios!=0){
			seguro+=(seguro*0.002);
			numeroVisitas-=1;
			}
		}
		if(numeroVisitas>=200){
			numeroVisitas=numeroVisitas/200;
			while(numeroVisitas!=0){
				seguro+=(seguro*0.003);
			numeroVisitas-=1;
			}
		}
		if (ramo=="industria"){
			seguro+=seguro*0.01;
		}
		if (ramo=="comercio"){
			seguro+=seguro*0.005;
		}
		
		return seguro;
	}
	
	
	public int getNumeroFuncionarios() {
		return numeroFuncionarios;
	}
	public void setNumeroFuncionarios(int numeroFuncionarios) {
		this.numeroFuncionarios = numeroFuncionarios;
	}
	public int getNumeroVisitas() {
		return numeroVisitas;
	}
	public void setNumeroVisitas(int numeroVisitas) {
		this.numeroVisitas = numeroVisitas;
	}
	public String getRamo() {
		return ramo;
	}
	public void setRamo(String ramo) {
		this.ramo = ramo;
	}
	

}

