package com.weslange.springboot.sylveria.entity;

import javax.persistence.*;

@Entity
@Table( name="gamer" )
public class Gamer {

	//Begin JSON data.
	//-----------------------
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	@Column( name="id" )
	private int id;

	@Column( name="email" )
	private String email;

	@Column( name="temporaryIdKey" )
	private String temporaryIdKey;

	@Column( name="saveFileBackup" )
	private String saveFileBackup;

	@Column( name="saveFileSafety" )
	private String saveFileSafety;


	public Gamer() {}

	public Gamer( String email, String temporaryIdKey, String saveFileBackup, String saveFileSafety ) {

		this.email = email;
		this.temporaryIdKey = temporaryIdKey;
		this.saveFileBackup = saveFileBackup;
		this.saveFileSafety = saveFileSafety;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTemporaryIdKey() {
		return temporaryIdKey;
	}

	public void setTemporaryIdKey(String temporaryIdKey) {
		this.temporaryIdKey = temporaryIdKey;
	}

	public String getSaveFileBackup() {
		return saveFileBackup;
	}

	public void setSaveFileBackup(String saveFileBackup) {
		this.saveFileBackup = saveFileBackup;
	}

	public String getSaveFileSafety() {
		return saveFileSafety;
	}

	public void setSaveFileSafety( String saveFileSafety)  {
		this.saveFileSafety = saveFileSafety;
	}

	//This is done as a security safety.
	@Override
	public String toString() {
		return "";
	}

}











