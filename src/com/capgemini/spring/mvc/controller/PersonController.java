package com.capgemini.spring.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capgemini.spring.mvc.model.entity.Person;
import com.capgemini.spring.mvc.model.service.PersonService;

//http://localhost:8989/PersonSpringMVC/app/person/new
@Controller
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public String inputPage() {
		return "input";
	}
	
	@RequestMapping("/new")
	public String addNewPerSon(@RequestParam("personId") int personId, @RequestParam("personName") String personName) {
		
		service.addNew(new Person(personId,personName));
		return "success";
		
	}
}
