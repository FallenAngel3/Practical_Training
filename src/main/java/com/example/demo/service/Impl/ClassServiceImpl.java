package com.example.demo.service.Impl;

import com.example.demo.bean.CommodityClass;
import com.example.demo.mapper.ClassMapper;
import com.example.demo.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ClassServiceImpl implements ClassService {
	@Autowired
	private ClassMapper classMapper;
	
	@Override
	public Map<String, Object> classList() {
		List<CommodityClass> list = classMapper.classList();
		HashMap<String, Object> map = new HashMap<>();
		map.put("data", list);
		return map;
	}
	
	@Override
	public int add(CommodityClass commodityClass) {
		return classMapper.add(commodityClass);
	}
	
	@Override
	public void del(int id) {
		classMapper.del(id);
	}
	
	@Override
	public int upd(CommodityClass commodityClass) {
		return classMapper.upd(commodityClass);
	}
}
