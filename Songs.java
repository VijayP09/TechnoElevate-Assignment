package com.technoelevate.hibernate3.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="song_list")
public class Songs implements Serializable {
	@Id
	private int songNo;
	private String songName;
	private String singer;
	private double duraion;
	public int getSongNo() {
		return songNo;
	}
	public Songs(int songNo, String songName, String singer, double duraion) {
		super();
		this.songNo = songNo;
		this.songName = songName;
		this.singer = singer;
		this.duraion = duraion;
	}
	public void setSongNo(int songNo) {
		this.songNo = songNo;
	}
	public String getSongName() {
		return songName;
	}
	public void setSongName(String songName) {
		this.songName = songName;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public double getDuraion() {
		return duraion;
	}
	public void setDuraion(double duraion) {
		
		this.duraion = duraion;
	}
	@Override
	public String toString() {
		return "Songs [songNo=" + songNo + ", songName=" + songName + ", singer=" + singer + ", duraion=" + duraion
				+ "]";
	}

}
