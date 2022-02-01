package br.com.alura.acao;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NovaEmpresaForm {
	
	public String executa(HttpServletRequest request, HttpServletResponse response) 
			throws ServerException, IOException{
		
		return "forward:formNovaEmpresa.jsp";
		
	}

}
