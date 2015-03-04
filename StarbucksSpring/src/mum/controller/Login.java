package mum.controller;

import mum.domain.*;
import mum.repository.*;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

@Controller
@SessionAttributes({"Username", "userValid"}) 
public class Login {
	//firstpage er age / na dileo hoi
	@RequestMapping(value = { "/", "/firstpage2" }, method = RequestMethod.GET)
	public String goIndex(Model model) {
		return "index";
	}
	
	@RequestMapping(value = { "/logout" }, method = RequestMethod.GET)
	public String goLogout(SessionStatus status) {
		status.setComplete();
		return "redirect:firstpage2";
	}

	@RequestMapping(value = { "/authenticate" }, method = RequestMethod.POST)
	public String goLogin(User userDetails, Model model) {
		TestDataImpl test = new TestDataImpl();

		String userName = userDetails.getPolash();
		System.out.println("-------------" + userName);
		String userPassword = userDetails.getPassword();
		System.out.println("-------------" + userPassword);

		if (userName != "" && userPassword != "") 
		{
			if (test.getPassword(userName) == null) 
			{
				return "index";
			} 
			else 
			{
				if (test.getPassword(userName).equals(userPassword))
				{
					model.addAttribute("Username", userName);
					model.addAttribute("userValid", true);
					System.out.println("------------- Succeessfull");
					return "successful";
				} 
				else 
				{
					return "index";
				}
			}
		} 
		else 
		{
			return "index";
		}
	}
}
