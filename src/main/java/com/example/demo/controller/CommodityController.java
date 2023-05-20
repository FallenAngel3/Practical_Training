package com.example.demo.controller;

import com.example.demo.bean.Commodity;
import com.example.demo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/commodity")
public class CommodityController {
	@Autowired
	private CommodityService commodityService;
	
	@RequestMapping("/commodityList")
	@ResponseBody
	public Map<String, Object> commodityList() {
		return commodityService.commodityList();
	}
	
	@RequestMapping("/commodity_toAdd")
	public String toAdd() {
		return "add";
	}
	
	@RequestMapping("/add")
	public String add(Commodity commodity) {
		int i = commodityService.add(commodity);
		return "redirect:/user/index";
	}
	
	@RequestMapping("/commodity_del")
	public String del(int id) {
		commodityService.del(id);
		return "redirect:/user/index";
	}
	
	@RequestMapping("/commodity_toUpd")
	public ModelAndView toUpd(int id) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("upd");
		modelAndView.addObject("id", id);
		return modelAndView;
	}
	
	@RequestMapping("/upd")
	public String upd(Commodity commodity) {
		commodityService.upd(commodity);
		return "redirect:/user/index";
	}
	
	@RequestMapping("getCommodityById")
	@ResponseBody
	public Map<String, Object> getCommodityById(int id) {
		HashMap<String, Object> map = new HashMap<>();
		Commodity commodity = commodityService.getCommodityById(id);
		map.put("data", commodity);
		return map;
	}

	@RequestMapping("/commodityList1")
	@ResponseBody
	public Map<String, Object> commodityList1(){

		return  commodityService.commodityList1();
	}
	@RequestMapping("/commodityclassList")
	@ResponseBody
	public Map<String, Object> commodityclassList(){

		return  commodityService.commoditycclassList();
	}
	@RequestMapping("/findById")
	@ResponseBody
	public Map<String, Object> findById(int id){

		return  commodityService.findById(id);
	}
}
