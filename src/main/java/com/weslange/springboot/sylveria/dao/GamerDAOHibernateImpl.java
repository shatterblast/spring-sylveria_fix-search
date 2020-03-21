package com.weslange.springboot.sylveria.dao;

import com.weslange.springboot.sylveria.entity.Gamer;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class GamerDAOHibernateImpl implements GamerDAO {

	private EntityManager entityManager;

	@Autowired
	public GamerDAOHibernateImpl( EntityManager theEntityManager ) {
		entityManager = theEntityManager;
	}

	@Override
	public Gamer findById( int id ) {
		Session currentSession = entityManager.unwrap( Session.class );
		Gamer gamer = currentSession.get( Gamer.class, id );
		return gamer;
	}

	@Override
	public void save( Gamer gamer ) {
		Session currentSession = entityManager.unwrap( Session.class );
		currentSession.saveOrUpdate( gamer );
	}

}







