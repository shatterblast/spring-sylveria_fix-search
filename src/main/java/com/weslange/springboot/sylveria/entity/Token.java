package com.weslange.springboot.sylveria.entity;

import javax.persistence.*;

@Entity
@Table( name="token" )
public class Token {

	//Begin JSON data.
	//-----------------------
	@Id
	@GeneratedValue( strategy=GenerationType.IDENTITY )
	@Column( name="id" )
	private int id;

	@Column( name="sylveriaToken" )
	private String sylveriaToken;

	public Token() {}

	public Token ( String sylveriaToken) {
		this.sylveriaToken = sylveriaToken;
	}

	public String getSylveriaToken() {
		return sylveriaToken;
	}

	public void setSylveriaToken( String sylveriaToken ) {
		this.sylveriaToken = sylveriaToken;
	}

	@Override
	public String toString() {
		return "Token [sylveriaToken=" + sylveriaToken + "]";
	}
		
}











