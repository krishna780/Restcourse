package com.example.demo.controllerclass;

import com.example.demo.model.Helloworldbean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(method = RequestMethod.GET, path = "/hell-world")
	public String heeloWorld() {
		return "Hello World";
	}

	@RequestMapping(path = "/helloworld-bean")
	public Helloworldbean helloWorld_Bean() {
		return new Helloworldbean("Hello World");
	}

}
