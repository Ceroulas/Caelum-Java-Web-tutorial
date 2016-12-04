package br.com.caelum.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.caelum.dao.ContatoDao;
import br.com.caelum.modelo.Contato;

@WebServlet("/adicionaContato")
public class AdicionaContatoSerlvet extends HttpServlet{

	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		Contato contato = new Contato();
		contato.setNome(request.getParameter("nome"));
		contato.setEmail(request.getParameter("email"));
		contato.setEndereco(request.getParameter("endereco"));
		
		Calendar dataNascimento = null;
		try {
			Date date = new SimpleDateFormat("dd/MM/yyyy").parse(request.getParameter("dataNascimento"));
			dataNascimento = Calendar.getInstance();
			dataNascimento.setTime(date);
		} catch (ParseException e) {
			out.println("Erro conversão da data!");
			return;
		}
		
		contato.setDataNascimento(dataNascimento);
		ContatoDao dao = new ContatoDao();
		
		dao.adiciona(contato);
		
		out.println("<html>");
		out.println("<body>");
		out.println("<h1>Contato "+ contato.getNome()+ " adicionado com sucesso.</h1>");
		out.println("</body>");
		out.println("</html>");
	}
}
