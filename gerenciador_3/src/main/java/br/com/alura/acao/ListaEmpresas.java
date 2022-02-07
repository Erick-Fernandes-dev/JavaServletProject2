package br.com.alura.acao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.alura.modelo.Banco;
import br.com.alura.modelo.Empresa;

public class ListaEmpresas implements Acao{
	
	public String executa(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		long antes = System.currentTimeMillis();
		
		
		System.out.println("Lista de empresas");
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresas();
		
		request.setAttribute("empresas", lista);
		
		long depois = System.currentTimeMillis();
		
		System.out.println("Temo de execução: " + (depois - antes));
		
		return "forward:listaEmpresas.jsp";
			
	}

}
