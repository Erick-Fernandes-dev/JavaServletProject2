package br.com.alura.acao;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.modelo.Usuario;

public class Login implements Acao {

	@Override
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		
		
//		Usuario u = new Usuario();
//		u.setLogin(paramLogin);
//		u.setSenha(paramSenha);
		
		System.out.println("Logando" + login);
		
		
		
		return "redirect:entrada?acao=ListaEmpresas";
	}

}