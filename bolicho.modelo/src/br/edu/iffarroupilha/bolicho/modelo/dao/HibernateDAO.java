package br.edu.iffarroupilha.bolicho.modelo.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import br.edu.iffarroupilha.bolicho.modelo.Cliente;

public class HibernateDAO {
   
	private static SessionFactory fabrica;
	
	static {
		
		Configuration cfg = new Configuration();
		// depois adicionar as demais entidades
		// apos ter feito o mapeamento
		cfg.addAnnotatedClass(Cliente.class );
		cfg.configure();
		// forma mais facil de criar uma fabri
		fabrica = cfg.buildSessionFactory();
		
	}
	
	public static Session getSessao(){
		return fabrica.openSession();
	}
	
	
	
}
