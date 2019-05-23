package com.tog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tog.entity.MstUser;
import com.tog.service.MstUserSvc;

@RestController
@RequestMapping(value="/welcome")
public class WelcomeController {
	
	@Autowired
	private MstUserSvc mstUserSvc;
	
	@RequestMapping(value="", method=RequestMethod.GET, produces=MediaType.TEXT_PLAIN_VALUE)
	public String getWelcome(){
		return "Hello World... Welcome to My Web";
	}
	
	@RequestMapping(
			value="/users", 
			method=RequestMethod.GET, 
			produces=MediaType.APPLICATION_JSON_VALUE)
	public List<MstUser> getListUsers(){
		return mstUserSvc.findAll();
	}

}
