package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleRestController 
{
	@GetMapping(value = "/")
	public String welcome()
	{
		return "Welcome to my simple controller.";
	}
	
	@GetMapping(value="/{name}")
	public String welcomeWithName(@PathVariable("name") String name)
	{
		return "Welcome " + name + " to Spring boot with AWS.";
	}

}
