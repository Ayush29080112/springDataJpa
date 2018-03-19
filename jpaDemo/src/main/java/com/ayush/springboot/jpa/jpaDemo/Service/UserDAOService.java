package com.ayush.springboot.jpa.jpaDemo.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.ayush.springboot.jpa.jpaDemo.Entity.User;

@Repository
@Transactional
public class UserDAOService {
//rather than adding transaction management on each and every method what jpa provides is interface to do declarative transaction
	@PersistenceContext//specifies all the entities persisted by entity manager will be in persistence scope and will be tracked by entity manager for any changes made after persistence.
	private EntityManager entityManager;
	
	public long insert(User user){
		//open transaction
		entityManager.persist(user);
		//close transaction
		return user.getId();
	}
}
