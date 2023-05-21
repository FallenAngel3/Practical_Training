package com.example.demo.controller;

import com.example.demo.util.Base64Util;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.util.HashMap;
import java.util.Map;

@Controller
public class IndexController {
	@RequestMapping("/")
	public String login(){
		return "login";
	}
	
	@RequestMapping("/register")
	public String register(){
		return "register";
	}
	
	@RequestMapping("/upload")
	@ResponseBody
	public Map<String, Object> upload(MultipartFile file){
		String base64 = Base64Util.convertToBase64(file);
		HashMap<String, Object> map = new HashMap<>();
		map.put("img", base64);
		return map;
	}
	@RequestMapping("/userindex")
	public String index(){
		return "Userindex";
	}
	@RequestMapping("/category")
	public String category(){
		return "category";
	}
}
