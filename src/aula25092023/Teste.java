package aula25092023;

public class Teste {

	public static void main(String[] args) {
		
		PessoaFisica cpf = new PessoaFisica();
		PessoaJuridica cnpj = new PessoaJuridica();
		PessoaFisicaController repCPF = new PessoaFisicaController();
		PessoaJuridicaController repCNPJ = new PessoaJuridicaController();
		
		cpf.setNome("teste pf");
		cpf.setCpf(123456789);
		cnpj.setNome("teste pj");
		cnpj.setCnpj(123456789);
		
		if(repCPF.salvaPessoa(cpf)) {
			System.out.println("PF salva");
		}
		if(repCNPJ.salvaPessoa(cnpj)) {
			System.out.println("PJ salva");
		}	
		
		System.out.println("PF:" + repCPF.retornaListaPessoa().get(0).getNome() +" - Cpf:" + repCPF.retornaListaPessoa().get(0).getCpf());
		System.out.println("PJ:" + repCNPJ.retornaListaPessoa().get(0).getNome() +" - Cnpj:" + repCNPJ.retornaListaPessoa().get(0).getCnpj());

		cpf.setNome("teste edicao pf");
		cpf.setCpf(1111111111);
		cnpj.setNome("teste edicao pj");
		cnpj.setCnpj(1111111111);
		
		if(repCPF.atualizaPessoa(cpf)) {
			System.out.println("PF atualizada");
		}
		if(repCNPJ.atualizaPessoa(cnpj)) {
			System.out.println("PJ atualizada");
		}
		
		System.out.println("PF:" + repCPF.retornaListaPessoa().get(0).getNome() +" - Cpf:" + repCPF.retornaListaPessoa().get(0).getCpf());
		System.out.println("PJ:" + repCNPJ.retornaListaPessoa().get(0).getNome() +" - Cnpj:" + repCNPJ.retornaListaPessoa().get(0).getCnpj());
		
		if(repCPF.deletaPessoa(cpf.getCpf())) {
			System.out.println("PF deletada");
		}
		
		if(repCNPJ.deletaPessoa(cnpj.getCnpj())) {
			System.out.println("PJ deletada");
		}
		
	}

}
