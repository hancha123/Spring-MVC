package egovframework.example.web;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import egovframework.example.service.Person;
import egovframework.example.service.PersonService;

@RestController
public class PersonController {
	@Resource(name = "personService")
	private PersonService personService;

	@GetMapping("/selectPerson.do")
	public List<Person> selectPerson() {			
		return personService.selectPerson();
	}
}
