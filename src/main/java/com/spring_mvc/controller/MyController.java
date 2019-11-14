package com.spring_mvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.spring_mvc.model.Contact;
import com.spring_mvc.model.MyUser;
import com.spring_mvc.service.MyServiceIntf;

@Controller("myController")
public class MyController {
	@Autowired
	MyServiceIntf myService;
	
	@RequestMapping(value="/contact",method=RequestMethod.POST)
	public ModelAndView insertContact(HttpServletRequest request, HttpServletResponse reponse){
		String name = request.getParameter("name");
		String info = request.getParameter("info");
		Contact contact = new Contact();
		contact.setName(name);
		contact.setInfo(info);
		boolean flag = myService.insertContact(contact);
		ModelAndView mav = new ModelAndView();
		mav.addObject("name",name);
		if(flag)
			mav.addObject("status","Thanks, message is accepted");
		else
			mav.addObject("status", "Sorry, message is not accepted");
		mav.setViewName("contactreport");
		return mav;
	}
	
	@RequestMapping(value="/register",method=RequestMethod.GET)
	public ModelAndView goToRegister(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = new ModelAndView("register");
		return mav;
	}
	@RequestMapping(value="/registerProcess", method=RequestMethod.POST)
	public ModelAndView insertUser(HttpServletRequest request, HttpServletResponse response){
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String first_name = request.getParameter("first_name");
		String last_name = request.getParameter("last_name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");
		String phone = request.getParameter("phone");
		MyUser user = new MyUser();
		user.setUsername(username);
		user.setPassword(password);
		user.setFirst_name(first_name);
		user.setLast_name(last_name);
		user.setEmail(email);
		user.setAddress(address);
		user.setPhone(phone);
		boolean flag = myService.insertUser(user);
		ModelAndView mav = new ModelAndView();
		if(flag){
			mav.setViewName("login");
		}
		else
		{
			mav.addObject("error","Sorry, Try Again!");
			mav.setViewName("contactreport");
			mav.setViewName("register");
		}
		
		return mav;
	}
	
	public ModelAndView loginUser(HttpServletRequest request, HttpServletResponse response){
		ModelAndView mav = null;
		
		return mav;
	}
}
