package egovframework.example.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	//@RequestMapping("/restController.do")
	@GetMapping("/restController.do")
	public String restController() throws Exception {
		return "<!DOCTYPE html>"
		+ "<html>"
		+ "<head>"
		+ "<meta charset=\'UTF-8\'>"
		+ "<title>Welcome</title>"
		+ "</head>"
		+ "<body>"
		+ "<p align=\'center\' style=\'font-size:30px; color:blue;\'>"
		+ "Welcome from Spring Boot!"
		+ "</p>"
		+ "</body>"
		+ "</html>";
	}
}