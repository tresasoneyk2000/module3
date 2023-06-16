package com.ust.employee;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping()
public class BootResource {
	@GetMapping
	@RequestMapping("/test")
	public String message() {
		return "success";

}
}