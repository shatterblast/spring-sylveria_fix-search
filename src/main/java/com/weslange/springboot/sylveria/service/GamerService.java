package com.weslange.springboot.sylveria.service;

import com.weslange.springboot.sylveria.entity.Gamer;

public interface GamerService {
//This class should match GamerDAO.java.

	public Gamer findById( int id );

	public void save( Gamer gamer );
	
}
