package aula25092023;

import java.util.ArrayList;
import java.util.List;

public class PessoaJuridicaController implements IPessoa {

	List<PessoaJuridica> listaPJ = new ArrayList<PessoaJuridica>();

	public PessoaJuridicaController() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean salvaPessoa(Pessoa pessoa) {
		boolean ok;
		
		PessoaJuridica cnpj = (PessoaJuridica) pessoa;
				
		try {
			ok=listaPJ.add(cnpj);
		} catch (Exception e) {
			ok=false;
		}
		return ok;
	}

	@Override
	public List<PessoaJuridica> retornaListaPessoa() {
		// TODO Auto-generated method stub
		return listaPJ;
	}

	@Override
	public boolean atualizaPessoa(Pessoa pessoa) {
		boolean ok = false;
		
		PessoaJuridica cnpj = (PessoaJuridica) pessoa;

		try {
			for(int i =0; i < retornaListaPessoa().size(); i++) {
				if(retornaListaPessoa().get(i).getNome().equalsIgnoreCase(cnpj.getNome())) {
					retornaListaPessoa().get(i).setNome(cnpj.getNome());
					retornaListaPessoa().get(i).setCnpj(cnpj.getCnpj());
					ok=true;
				}
			}	
		} catch(Exception e) {
			ok=false;
		}
	
		return ok;
	}

	@Override
	public boolean deletaPessoa(int cnpj) {
		boolean ok = false;
		try {
			for(int i =0; i < retornaListaPessoa().size(); i++) {
				if(retornaListaPessoa().get(i).getCnpj()==cnpj){
					retornaListaPessoa().remove(i);
					ok=true;
				}
			}	
		} catch(Exception e) {
			ok=false;
		}
	
		return ok;
	}

}
