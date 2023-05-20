package com.example.demo.bean;

import lombok.Data;

@Data
public class Commodity {
	private int id;
	private int class_id;
	private String class_name;
	private String commodity_name;
	private double commodity_price;
	private double commodity_num;
	private String commodity_status;
	private String commodity_img;
}
