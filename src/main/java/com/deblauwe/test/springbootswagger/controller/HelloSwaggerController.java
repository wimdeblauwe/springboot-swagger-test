package com.deblauwe.test.springbootswagger.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloSwaggerController
{
	@RequestMapping("/hello")
	public String helloSwagger()
	{
		return "Hello Swagger";
	}
}
