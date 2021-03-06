package br.com.alura.modelo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Servlet implementation class Banco
 */
public class Banco  {
	
	
	private static List<Empresa> lista = new ArrayList<>();
	private static Integer chaveSequencial = 1;
	
	static {
		
		Empresa empresa = new Empresa();
		empresa.setNome("Alura");
		empresa.setId(chaveSequencial++);
		
		Empresa empresa2 = new Empresa();
		empresa2.setNome("Caelum");
		empresa2.setId(chaveSequencial++);
		
		lista.add(empresa);
		lista.add(empresa2);
		
	}
	
	
	public void adciona(Empresa empresa) {
		
		empresa.setId(chaveSequencial++);
		Banco.lista.add(empresa);
		
	}
	
	public List<Empresa> getEmpresas() {
		return Banco.lista;
	}
	
	public void removeEmpresa(Integer id) {
		
		Iterator<Empresa> it = lista.iterator();
		
		while (it.hasNext()) {
			Empresa emp = it.next();
			
			if(emp.getId() == id) {
				it.remove();
			}
		}
		
		
	}
	
	public Empresa buscaEmpresaPelaId(Integer id) {
		
		for (Empresa empresa : this.lista) {
			if (empresa.getId() == id) {
				return empresa;
			}
		}
		
		return null;
		
	}
	
       

	

}
