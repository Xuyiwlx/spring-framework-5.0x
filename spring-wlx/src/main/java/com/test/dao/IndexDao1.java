package com.test.dao;

/*
 * Created by wlx on 2020/2/9
 */
public class IndexDao1 implements Dao {
	public IndexDao1() {
		System.out.println("indexDao1-init");
	}

	@Override
	public void query() {
		System.out.println("index1");
	}
}
