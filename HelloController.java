package fi.terasvirta.ekatehtava2.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("index")
	@ResponseBody
	public String index() {
		return "This is the main page";
	}
	
	@RequestMapping("contact")
	@ResponseBody
	public String contact() {
		return "This is the contact page";
	}
	
	@RequestMapping("hello")
	@ResponseBody
	public String greetings(@RequestParam(value="location")String location, @RequestParam(value="name")String name, Model model) {
		model.addAttribute("location", location);
		model.addAttribute("name", name);
		return "Welcome to " + location + ", " + name + "!";
	}
}
