package br.com.caelum.mvc.logica;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class PrimeiraLogica implements Logica{

	@Override
	public String executa(HttpServletRequest req, HttpServletResponse response) throws Exception {
		System.out.println("Executando primeira logica");
		System.out.println("Retornando nome da página JSP...");
		
		return "primeira-logica.jsp";
	}
	

}
