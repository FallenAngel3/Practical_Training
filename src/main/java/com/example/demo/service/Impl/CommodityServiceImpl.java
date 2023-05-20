package com.example.demo.service.Impl;

import com.example.demo.bean.Commodity;
import com.example.demo.mapper.CommodityMapper;
import com.example.demo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Service
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	private CommodityMapper commodityMapper;
	@Override
	public Map<String, Object> commodityList() {
		List<Commodity> list = commodityMapper.commodityList();
		HashMap<String, Object> map = new HashMap<>();
		map.put("data", list);
		return map;
	}
	
	@Override
	public int add(Commodity commodity) {
		return commodityMapper.add(commodity);
	}
	
	@Override
	public void del(int id) {
		commodityMapper.del(id);
	}
	
	@Override
	public Commodity getCommodityById(int id) {
		return commodityMapper.getCommodityById(id);
	}
	
	@Override
	public void upd(Commodity commodity) {
		commodityMapper.upd(commodity);
	}
}
