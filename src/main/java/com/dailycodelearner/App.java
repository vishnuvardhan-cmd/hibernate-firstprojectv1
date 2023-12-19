package com.dailycodelearner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.dailycodelearner.entity.Song;

public class App {

	private static Session session=null;
	
	public static Session getSessionFactory() {
		
		if(session==null)
		{
		Configuration configuration=new Configuration();
		configuration.configure();
		configuration.addAnnotatedClass(Song.class);
		SessionFactory factory = configuration.buildSessionFactory();
		session=factory.openSession();
		}
		return session;
	}

}
