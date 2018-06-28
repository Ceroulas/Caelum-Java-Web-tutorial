package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.mvc.dao.ContatoDao;
import br.com.caelum.mvc.modelo.Contato;

public class RemoveContatoLogica implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse response) throws Exception {
			String parametro = req.getParameter("id");
			Long id = Long.parseLong(parametro);
			Contato contato  = new Contato();
			contato.setId(id);
			ContatoDao dao = new ContatoDao();
			dao.remove(contato);
			System.out.println("Excluindo contato...");
				return "mvc?logica=ListaContatosLogic";
	}

}
