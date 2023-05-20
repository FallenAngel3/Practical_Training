package com.example.demo.controller;

import com.example.demo.bean.CommodityClass;
import com.example.demo.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/class")
public class ClassController {
	@Autowired
	private ClassService classService;
	
	@RequestMapping("/classManage")
	public String classManage(){
		return "classManage";
	}
	
	@RequestMapping("/classList")
	@ResponseBody
	public Map<String, Object> classList(){
		return classService.classList();
	}
	
	@RequestMapping("/class_toAdd")
	public String toAdd(){
		return "ClassAdd";
	}
	
	@RequestMapping("/add")
	public String add(CommodityClass commodityClass){
		int i = classService.add(commodityClass);
		return "redirect:/class/classManage";
	}
	
	@RequestMapping("/class_del")
	public String del(int id){
		classService.del(id);
		return "redirect:/class/classManage";
	}
	
	@RequestMapping("/class_toUpd")
	public ModelAndView class_toUpd(int id){
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("ClassUpd");
		modelAndView.addObject("id", id);
		return modelAndView;
	}
	
	@RequestMapping("/upd")
	public String upd(CommodityClass commodityClass){
		int i = classService.upd(commodityClass);
		return "redirect:/class/classManage";
	}
}
