package com.spring_mvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring_mvc.dao.MyDaoIntf;
import com.spring_mvc.model.Contact;
import com.spring_mvc.model.MyUser;

@Service("myService")
public class MyServiceImpl implements MyServiceIntf{
	@Autowired
	MyDaoIntf myDao;
	public boolean insertContact(Contact contact){
		boolean flag= myDao.insertContact(contact);
		System.out.println("service is called");
		return flag;
	}
	public boolean insertUser(MyUser user){
		return myDao.insertUser(user);
	}
}
