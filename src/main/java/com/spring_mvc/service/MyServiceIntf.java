package com.spring_mvc.service;

import com.spring_mvc.model.Contact;
import com.spring_mvc.model.MyUser;

public interface MyServiceIntf {
	public boolean insertContact(Contact contact);
	public boolean insertUser(MyUser user);
}
