package com.dailycodelearner;

import org.hibernate.Session;

import com.dailycodelearner.entity.Song;

public class CreateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=App.getSessionFactory();
		Song song=new Song();
		song.setSongName("Yaalo Yaalaa");
		song.setArtist("Anurag Kulkarni");
		session.beginTransaction();
		session.save(song);
		session.getTransaction().commit();
		session.close();
		System.out.println("check database");
	}

}
