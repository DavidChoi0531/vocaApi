package com.davidchoi.vocaApi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProjectController {
	
	@RequestMapping("/titanic")
	public String titanic() {
		return "titanic";
	}
	
	@RequestMapping("/CCTV")
	public String cctv() {
		return "cctv";
	}
}
