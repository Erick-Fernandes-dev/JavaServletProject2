package br.com.alura.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.thoughtworks.xstream.XStream;

import br.com.alura.modelo.Banco;
import br.com.alura.modelo.Empresa;

@WebServlet("/empresas")
public class EmpresasService extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Empresa> empresas = new Banco().getEmpresas();

		String valor = request.getHeader("Accept");

		if (valor.contains("xml")) {

			XStream xstream = new XStream();

			xstream.alias("empresa", Empresa.class);
			String xml = xstream.toXML(empresas);

			response.setContentType("application/xml");
			response.getWriter().print(xml);

		} else if (valor.contains("json")) {

			Gson gson = new Gson();
			String json = gson.toJson(empresas);// de objeto para json

			// definindo o tipo de conte�do na resposta, para JSON, (application/json)
			response.setContentType("application/json");

			// um m�todo que devolve uma string e imprime na sa�da o JSON.
			response.getWriter().print(json);
		} else {
			
			response.setContentType("application/json");
			response.getWriter().print("{'message' : 'no content'}");
			
		}

	}

}
