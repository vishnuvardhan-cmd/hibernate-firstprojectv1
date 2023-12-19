package com.dailycodelearner.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="song")
public class Song {
	
	@Id
	@Column(name="songId")
	private int id;
	private String songName;
	@Column(name="singer")
	private String artist;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public Song(int id, String songName, String artist) {
		super();
		this.id = id;
		this.songName = songName;
		this.artist = artist;
	}
	public Song() {
		super();
	}
	@Override
	public String toString() {
		return "Song [id=" + id + ", songName=" + songName + ", artist=" + artist + "]";
	}
	
	

}
