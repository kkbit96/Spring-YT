package com.bootrestbook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class BookController {
	@GetMapping("/books")
	public String getBooks() {
		return "This is for test String";
		
	}
}
