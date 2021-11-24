package com.test.main;

import com.test.entity.City;
import com.test.util.CommonUtil;

/*
 * Created by wlx on 2020/2/2
 */
public class TestCustomAnno {

	public static void main(String[] args) {
		City city = new City();
		city.setId("1");
		city.setName("test");
		String querySql = CommonUtil.buildQuerySql(city);
		System.out.println(querySql);
	}

}
