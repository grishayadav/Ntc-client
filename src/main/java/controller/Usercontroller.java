package controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import model.User;

@Controller
public class Usercontroller {
	@Autowired
	RestTemplate restTemplate;

	public void setRestTemplate(RestTemplate restTemplate) {
		this.restTemplate = restTemplate;
	}

	@RequestMapping(value = "/login")

	public String login() {
		return "Login page";// return will always be jsp page i.e name of jsp
							// page login page.
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(User u) {
		return "Mainpage";//when we open login page we need to keep information i.e username and password.
	}

	@RequestMapping(value = "register/")
	public String registration() {
		return "Registrationpage";
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String register(User u) {
		return "Login page";
	}

	@RequestMapping(value = "main/")
	public String main() {
		return "MainPage";
	}
}