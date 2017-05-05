package br.edu.iffarroupilha.bolicho.visao.web;

import br.com.caelum.vraptor.Resource;
import br.edu.iffarroupilha.bolicho.controle.ClienteControle;
import br.edu.iffarroupilha.bolicho.modelo.Cliente;

@Resource
public class ClienteController {

	
	public void listar(){
		System.out.println("aqui vamos buscar os clientes!");
	}
	
	public void gravar(){
		ClienteControle controle = new ClienteControle();
		
		// objeto temporario
		Cliente c = new Cliente();
		c.setNome("Jose");
		c.setCpf(123);
		
		controle.gravar( c  );
		
		
	}
	
}
