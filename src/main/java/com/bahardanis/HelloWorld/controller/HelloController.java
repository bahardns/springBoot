package com.bahardanis.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//kontrol sınıfı olduğunu belirtmek için kullanılan anatasyon.
public class HelloController {
	//localhost:8080/hello
	
	//hello metoduna ulaşmak için @getMapping kullanıyoruz.
	
	@GetMapping(path = "/hello")
	
	public String sayHello() {
		return "hello world";
	}
	
}
