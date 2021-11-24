package com.test.util;

import com.test.annotation.Entity;

/*
 * Created by wlx on 2020/2/2
 */
public class CommonUtil {
	public static String buildQuerySql(Object object) {
		Class clazz = object.getClass();
		//判断是否加了@Entity注解
		if (clazz.isAnnotationPresent(Entity.class)) {
			//得到注解
			Entity entity = (Entity)clazz.getAnnotation(Entity.class);
			//调用方法
			System.out.println(entity.value());
		}
		//select * from city where id = "1" and name = "test";
		String sql = "select * from ";
		return sql;
	}

}
