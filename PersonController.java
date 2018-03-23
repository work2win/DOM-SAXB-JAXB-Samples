package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import model.Person;

@Controller
public class PersonController {
	
	@RequestMapping("/person")
	public String person(Model model) {
		Person p = new Person();
		p.setFirstName("Simitha");
		p.setLastName("Madhavan");
		p.setAge(31);
		model.addAttribute("person",p);
		
		
		return "personview";
	}
}
