package com.seo.security1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	// localhost:8080
	@GetMapping({"", "/"})
	public String index() {
		// mustache src/main/resources/
		// viewResolve setting : templates(prefix), .mustache (suffix) 
		return "index"; // src/main/resources/templates/index.mustache
	}

}