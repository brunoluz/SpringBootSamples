package br.com.blight.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.blight.dataaccess.MyDataAccess;

@RestController
public class HelloWorldController {
	
	@Autowired
	MyDataAccess myDataAccess;

	@Value("${app.anystring}")
	private String anyString;
	
    @RequestMapping("/ola")
    public String get() {
        return myDataAccess.recuperarId();
    }
}
