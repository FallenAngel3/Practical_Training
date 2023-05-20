package com.example.demo.mapper;

import com.example.demo.bean.Commodity;
import com.example.demo.bean.CommodityClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CommodityMapper {
	List<Commodity> commodityList();
	
	int add(Commodity commodity);
	
	void del(int id);
	
	Commodity getCommodityById(int id);
	
	void upd(Commodity commodity);

	List<Commodity> commodityList1();

	List<CommodityClass> commodityclassList();

	List<Commodity> findById(int id);
}
