package com.spring_mvc.dao;

import com.spring_mvc.model.Contact;
import com.spring_mvc.model.MyUser;

public interface MyDaoIntf {

	public boolean insertContact(Contact contact);
	public boolean insertUser(MyUser user);
}
