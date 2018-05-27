package com.hlm.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


import org.springframework.web.servlet.ModelAndView;

import com.hlm.bo.Users;
import com.hlm.command.UsersCommand;
import com.hlm.dao.UsersDao;

@Controller
public class UsersController {
	
	@Resource
	private UsersDao usersDao ;
	
	@RequestMapping("/sigup.do")                                                                
	public ModelAndView  sigup(HttpServletRequest req){ 
		 ModelAndView mv = new ModelAndView();
		 
		UsersCommand cmd = new UsersCommand("ะกร๗",0,"admin@hlm.com",1,"123456" );
	    
		 Users bo = new Users();
		 BeanUtils.copyProperties(cmd, bo);
		 bo.setUserCode(bo.getUserName()+"1");
		 usersDao.createUsers(bo);
		
		 req.getSession().setAttribute("user", bo);
		 mv.addObject("password", bo.getPassword());
		 mv.addObject("userName", bo.getUserName());
		 System.out.println(bo.getPassword());
		 mv.setViewName("index");
	   return mv;
	}
}
