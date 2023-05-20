package com.example.demo.service;

import com.example.demo.bean.CommodityClass;

import java.util.Map;

public interface ClassService {
	Map<String, Object> classList();
	
	int add(CommodityClass commodityClass);
	
	void del(int id);
	
	int upd(CommodityClass commodityClass);
}
