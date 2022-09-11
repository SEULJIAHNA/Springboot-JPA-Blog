package com.cos.blog.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TempControllerTest {
	
		@GetMapping("/temp/home")
		public String tempHome() {
			System.out.println("temp home");
			return "/home.html";
		}
		
		@GetMapping("/temp/img")
		public String tempimg() {
			return "/a.png";
		}

		@GetMapping("/temp/jsp")
		public String tempJsp() {
			return "test";
		}
}
