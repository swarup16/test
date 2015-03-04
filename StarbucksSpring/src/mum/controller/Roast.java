package mum.controller;

import java.util.List;

import mum.domain.*;
import mum.repository.*;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Roast {
	@RequestMapping(value = { "/roastselection" }, method = RequestMethod.GET)
	public String goRoastSelection(RoastDetails roastAdvice) 
	{
		return "roastselection";
	}
	
	@RequestMapping(value = { "/roastadvice" }, method = RequestMethod.GET)
	public String goRoastAdvice(RoastDetails roastAdvice) 
	{

		TestDataImpl test = new TestDataImpl();
		System.out.println("-------------" +roastAdvice.getRoastChoice());	
		List<String> advice = test.getAdvice(roastAdvice.getRoastChoice());
		//roastAdvice.setRoastChoice(roastAdvice.getRoastChoice());
		roastAdvice.setRoastAdvice(advice);
	
		return "roastadvice";
	}
}