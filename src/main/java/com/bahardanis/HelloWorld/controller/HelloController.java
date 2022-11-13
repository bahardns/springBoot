package com.bahardanis.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api")
//sınıf seviyesinde kullanılan anatasyondur. 
//kontrol sınıfı olduğunu belirtmek için kullanılan anatasyon.controller altındaki endpointlere erişmek için, api yazılması gerekmektedir
public class HelloController {
	// localhost:8080/hello

	// hello metoduna ulaşmak için @getMapping kullanıyoruz.

	@GetMapping(path = "/hello")

	@RequestMapping(path = "/hello", method = RequestMethod.GET)

	public String sayHello() {
		return "hello world";
	}

}
