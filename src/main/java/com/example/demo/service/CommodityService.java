package com.example.demo.service;

import com.example.demo.bean.Commodity;

import java.util.Map;

public interface CommodityService {
	Map<String, Object> commodityList();
	
	int add(Commodity commodity);
	
	void del(int id);
	
	Commodity getCommodityById(int id);
	
	void upd(Commodity commodity);
}
