package com.weslange.springboot.sylveria.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

@Repository
public class TokenDAOHibernateImpl implements TokenDAO {

	private EntityManager entityManager;

	@Autowired
	public TokenDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

}







