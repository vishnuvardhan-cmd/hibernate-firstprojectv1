package com.dailycodelearner;

import org.hibernate.Session;

import com.dailycodelearner.entity.Song;

public class UpdateApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session=App.getSessionFactory();
		Song song=session.get(Song.class, 2);
		song.setSongName(song.getSongName().toUpperCase());
		session.beginTransaction();
		session.update(song);
		session.getTransaction().commit();
		session.close();
		System.out.println("check database");
	}

}
