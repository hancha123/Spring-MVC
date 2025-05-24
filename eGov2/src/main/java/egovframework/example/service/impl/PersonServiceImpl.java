package egovframework.example.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import egovframework.example.service.Person;
import egovframework.example.service.PersonService;

@Service("personService")
public class PersonServiceImpl implements PersonService{
	
	@Override
	public List<Person> selectPerson() {
		
		List<Person> list = new ArrayList<Person>();
				
		Person member1 = new Person();
		member1.setId("1");
		member1.setName("홍길동");
		member1.setEmail("hong@naver.com");
		list.add(member1);
		
		Person member2 = new Person();
		member2.setId("2");
		member2.setName("김길동");
		member2.setEmail("kim@naver.com");
		list.add(member2);
		
		Person member3 = new Person();
		member3.setId("3");
		member3.setName("박길동");
		member3.setEmail("park@naver.com");
		list.add(member3);
		
		return list;
	}
}