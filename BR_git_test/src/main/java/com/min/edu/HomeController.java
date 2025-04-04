package com.min.edu;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		String formattedDate = dateFormat.format(date);
		String formattedDate = dateFormat.format(date);
		String formattedDate = dateFormat.format(date);
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String homeaDD(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );

		if(true)model.addAttribute("DEV1에서 추가 수정", formattedDate );
		model.addAttribute("메인 에서 추가 수정", formattedDate );
		model.addAttribute("DEV1에서 추가 수정", formattedDate );
		model.addAttribute("DEV1에서 추가 수정", formattedDate );
		model.addAttribute("DEV1에서 추가 수정", formattedDate );
		model.addAttribute("DEV1에서 추가 수정", formattedDate );
		
		if(true) formattedDate = "오류수정";
		if(true) formattedDate = "오류수정";
		if(true) formattedDate = "오류수정";
		if(true) formattedDate = "오류수정";
		
		return "home";
	}
}

