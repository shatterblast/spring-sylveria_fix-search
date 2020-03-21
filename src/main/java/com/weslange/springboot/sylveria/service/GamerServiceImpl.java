package com.weslange.springboot.sylveria.service;

import com.weslange.springboot.sylveria.dao.GamerDAO;
import com.weslange.springboot.sylveria.entity.Gamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class GamerServiceImpl implements GamerService {

	private GamerDAO gamerDAO;

	@Autowired
	public GamerServiceImpl( GamerDAO gamerDAO ) {
		//I'm not sure if I should leave the "this." part off the front, but it should work anyways.
		gamerDAO = gamerDAO;
	}
	
	@Override
	@Transactional
	public Gamer findById( int id ) {
		return gamerDAO.findById( id );
	}

	@Override
	@Transactional
	public void save( Gamer gamer ) {
		gamerDAO.save( gamer );
	}

}






