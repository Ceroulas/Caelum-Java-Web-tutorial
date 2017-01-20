package br.com.caelum.teste;

import java.util.Calendar;

import br.com.caelum.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

public class TesteContatoDao {

	public static void main(String[] args) {
		ContatoDao dao = new ContatoDao();

		Contato contato = new Contato();
		contato.setNome("teste");
		contato.setEmail("j@mail.com");
		contato.setEndereco("Av. teste 888");
		contato.setDataNascimento(Calendar.getInstance());

		System.out.println("Adicionando contato.");
		dao.adiciona(contato);
		System.out.println("Adicionado com sucesso!");
		
		System.out.println("Alterando contato.");
		contato.setNome("trocandoNome");
		dao.altera(contato);
		System.out.println("Contato alterado com sucesso!");
		
		System.out.println("Listando contatos");
		dao.getLista();
		System.out.println("Contatos listado com sucessos!");

	}

}
