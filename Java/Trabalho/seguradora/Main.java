package br.unipe.java.unidade3.vendas;

import java.util.Scanner;

public class Main   {
	public static double resultado;
	public static void main(String[] args) {
			Scanner leitor=new Scanner(System.in);
	try{
		while (true){
	 		
				System.out.println("Tipo de Pessoa (juridica/fisica):");
				String tipo=leitor.nextLine();
				if (tipo=="juridica"){
					PessoaJuridical pessoa=new PessoaJuridical();
					System.out.println("CNPJ:");
					pessoa.cnpj=leitor.nextInt();
					
				}
				if (tipo =="fisica"){
					PessoaFisica pessoa=new PessoaFisica();
					System.out.println("CPF:");
					pessoa.cpf=leitor.nextInt();
					
				}
				System.out.println("Tipo de Contrato: ");	
				String contrato=leitor.nextLine();	
				if(contrato == "Residencial"){
					Residencial residencial=new Residencial();
					System.out.println("Nome :");
					residencial.cliente.nome=leitor.nextLine();
					residencial.cliente.setNome(residencial.cliente.nome);
					
					System.out.println("Data de nascimento :");
					residencial.cliente.datNascimento= leitor.nextInt();
					residencial.cliente.setDatNascimento(residencial.cliente.datNascimento); 			
					
					System.out.println("Valor do imovel: ");
					residencial.valorDoImovel= leitor.nextFloat();
					residencial.setValorDoImovel(residencial.valorDoImovel);
					
					System.out.println("Endereco: ");
					residencial.endereco=leitor.nextLine();
					residencial.setEndereco(residencial.endereco);
					
					System.out.println("Zona na qual o imóvel se encontra (urbana/suburbana/rural): ");
					residencial.zonaImovel=leitor.nextLine();
					residencial.setZonaImovel(residencial.zonaImovel);
					
					System.out.println("Tipo de residência (apartamento/casa): ");
					residencial.tipoResidencia=leitor.nextLine();
					residencial.setTipoResidencia(residencial.tipoResidencia);
					
					resultado=residencial.seguroResidencial(residencial.getValorDoImovel(),residencial.getZonaImovel(),residencial.getTipoResidencia());
					
		
					
				}
				if(contrato=="Empresario"){
					Empresarial empresarial=new Empresarial();
		
					System.out.println("Nome :");
					empresarial.cliente.nome=leitor.nextLine();
					empresarial.cliente.setNome(empresarial.cliente.nome);
					
					System.out.println("Data de nascimento :");
					empresarial.cliente.datNascimento= leitor.nextInt();
					empresarial.cliente.setDatNascimento(empresarial.cliente.datNascimento); 			
					
					System.out.println("Valor do imovel: ");
					empresarial.valorDoImovel= leitor.nextFloat();
					empresarial.setValorDoImovel(empresarial.valorDoImovel);
					
					System.out.println("Numero de funcionarios: ");
					empresarial.numeroFuncionarios=leitor.nextInt();
					empresarial.setNumeroFuncionarios(empresarial.numeroFuncionarios);
					
					System.out.println("Numero de visita: ");
					empresarial.numeroVisitas=leitor.nextInt();
					empresarial.setNumeroVisitas(empresarial.numeroVisitas);
					
					System.out.println("Ramo (comércio/indústria/agropecuária): ");
					empresarial.ramo=leitor.nextLine();
					empresarial.setRamo(empresarial.ramo);
					
					resultado=empresarial.seguroEmpresarial(empresarial.getValorDoImovel(),empresarial.getNumeroFuncionarios(),empresarial.getNumeroVisitas(),empresarial.getRamo());
						
					leitor.close();
				}
			}
		}
		catch(Exception ex){
		System.out.println("Digite um valor valido");
		}

}		
}


