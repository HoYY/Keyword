package com.hoyy.keyword.controllers;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;

import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hoyy.keyword.services.TestService;

@Controller
public class MainController {
	
	private static final Logger logger = LoggerFactory.getLogger(MainController.class);
	
	@Inject
	private TestService testService;
	
	@RequestMapping(value="/")
	public String home() {
		return "index";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.POST)
	public @ResponseBody JSONObject test(HttpServletRequest request) throws Exception {
		
		String test = request.getParameter("test");
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("rest", testService.selectTest());
		
		if(test.equals("test")) {
			logger.info("success");
			return jsonObject;
		}
		else {
			logger.info("No");
			return null;
		}
	}
	
}

