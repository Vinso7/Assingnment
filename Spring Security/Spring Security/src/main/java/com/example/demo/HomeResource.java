package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {
	
    @GetMapping("/homepage")
	public String homepage() {
		return ("<h1>welcome</h1>");
	}
    @GetMapping("/userpage")
	public String user() {
		return ("<h1>welcome user</h1>");
	}
    @GetMapping("/adminpage")
	public String admin() {
		return ("<h1>welcome admin</h1>");
	}
}
