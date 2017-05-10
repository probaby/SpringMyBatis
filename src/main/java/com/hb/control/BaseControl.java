package com.hb.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hb.service.BaseService;

@Controller
@RequestMapping("/controller")
public class BaseControl {
	@Autowired
	private BaseService baseService;
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	@ResponseBody
	private String list(String bookId) {
		String i = "0";
		if(bookId.equals("1")) {
			i = baseService.getStringList();
		}
		return i;
	}
	
	@RequestMapping(value = "/some", method = RequestMethod.GET)
	@ResponseBody
	private String list2(ModelMap model) {
		String i = "0";
		if(true) {
//			i = baseService.getStringList();
		}
		 model.addAttribute("message", "Spring 3 MVC Hello World");    
		return "hello";
	}

}
