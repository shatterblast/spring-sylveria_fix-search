package com.weslange.springboot.sylveria.dao;

import com.weslange.springboot.sylveria.entity.Gamer;

public interface GamerDAO {

	public Gamer findById( int id );
	
	public void save( Gamer gamer );

}
