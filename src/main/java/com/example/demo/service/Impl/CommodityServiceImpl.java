package com.example.demo.service.Impl;

import com.example.demo.bean.Commodity;
import com.example.demo.bean.CommodityClass;
import com.example.demo.mapper.CommodityMapper;
import com.example.demo.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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

	@Override
	public Map<String, Object> commodityList1() {
		List<Commodity> list = commodityMapper.commodityList1();
		Map<String,Object> map = new HashMap<>();
		map.put("data",list);
		return map;
	}

	@Override
	public Map<String, Object> commoditycclassList() {
		List<CommodityClass> list = commodityMapper.commodityclassList();
		Map<String,Object> map = new HashMap<>();
		map.put("data",list);
		return map;
	}

	@Override
	public Map<String, Object> findById(int id) {
		List<Commodity> list = commodityMapper.findById(id);
		Map<String,Object> map = new HashMap<>();
		map.put("data",list);
		return map;
	}

	@Override
	public void delsel(String ids) {
		//判断ids是否包含，
		if (ids.contains(",")) {
			//根据，拆分得到一个字符串数组
			String[] split = ids.split(",");
			//创建一个集合
			List<Integer> list = new ArrayList<Integer>();
			//遍历split字符串数组
			for (String s : split) {
				int i = 0;
				try {
					//将String字符类型数据转换为Integer整型数据
					i = Integer.parseInt(s);
				} catch (NumberFormatException e) {
				}
				//将转换的整形数据添加到集合里
				list.add(i);
			}
			//遍历list集合,删除id所在的集合
			for (Integer id : list) {
				commodityMapper.del(id);
			}
		}
	}
}
