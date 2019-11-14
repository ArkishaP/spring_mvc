package com.spring_mvc.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.stereotype.Repository;

import com.spring_mvc.model.Contact;
import com.spring_mvc.model.MyUser;

@Repository("myDao")
public class MyDaoImpl implements MyDaoIntf {

	public boolean insertContact(Contact contact) {
		System.out.println("dao");
		return true;
	}

	public boolean insertUser(MyUser user) {
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(user);
			em.getTransaction().commit();
			return true;
		}catch(Exception e){
			System.out.println(e);
		}
		return false;
	}

}
