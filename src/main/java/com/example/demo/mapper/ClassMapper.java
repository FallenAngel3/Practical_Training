package com.example.demo.mapper;

import com.example.demo.bean.CommodityClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClassMapper {
	List<CommodityClass> classList();
	
	int add(CommodityClass commodityClass);
	
	void del(int id);
	
	int upd(CommodityClass commodityClass);
}
