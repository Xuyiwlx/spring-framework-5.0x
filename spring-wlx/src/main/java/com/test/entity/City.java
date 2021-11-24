package com.test.entity;

import com.test.annotation.Entity;

/*
 * Created by wlx on 2020/2/2
 */
@Entity("city")
public class City {

	private String id;

	private String name;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
