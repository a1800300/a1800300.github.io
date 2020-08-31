package fi.lindholm.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

	//Create Spring Boot application that handle requests to the endpoints /index and /contact. Index
	//endpoint returns string ‘This is the main page’ and contact endpoint returns string ‘This is the contact
	//page’.
	
@RequestMapping("/index")
public String returnMain() {
	return "This is the main page";
}

@RequestMapping("/contact")
public String returnContact() {
	return "This is the contact page";
}

@RequestMapping("/hello")
public String returnGreetingForName(@RequestParam(name="name",defaultValue="location")String name, String location) {
	return "Welcome to the " + location + " " + name + "!";
}
	
}

