package com.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {
	@GetMapping(value ="/get")
	public String get() {
		return "karthikraja";
	}
	@GetMapping(value="/get1")
	public long get1() {
		return 8220196738l;
	}
	@GetMapping(value="/get2")
	public String get2() {
		return "DinaKaran";
	}

}
