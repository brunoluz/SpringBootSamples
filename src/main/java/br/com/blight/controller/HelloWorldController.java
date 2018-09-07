package br.com.blight.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@Value("${app.anystring}")
	private String anyString;
	
    @RequestMapping("/ola")
    public String get() {
        return anyString;
    }
}
