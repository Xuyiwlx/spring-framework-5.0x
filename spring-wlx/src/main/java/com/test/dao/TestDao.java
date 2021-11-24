package com.test.dao;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

/**
 * Created by wlx on 2019/9/30
 */
//实现ApplicationContextAware接口,解决单例调用prototype的问题(另一种是加@Lookup)
@Repository
public class TestDao implements ApplicationContextAware {

	private ApplicationContext applicationContext;

	public TestDao() {
		System.out.println("construct");
	}

	@PostConstruct
	public void init() {
		System.out.println("init");
	}

	public void query(){
		System.out.println("Hello Spring!");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext = applicationContext;
		System.out.println(applicationContext);
	}
}
