package br.com.alura.forum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	//acrescentado anotação para não precisar retornar uma pagina 
	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "Hello World";
	}

}
