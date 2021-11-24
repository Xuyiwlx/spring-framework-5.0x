package com.test.main;

/*
 * Created by wlx on 2019/9/30
 */

import com.test.app.AppConfig;
import com.test.dao.IndexDao2;
import com.test.dao.TestDao;
import com.test.interceptor.MyMethodInterceptor;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		//把spring所有的前提环境准备好(bean工厂/bean的容器/类被实例化)
		//准备工厂,DefaultListableBeanFactory
		//实例化一个bdReader和scanner
		AnnotationConfigApplicationContext annotationConfigApplicationContext =
				new AnnotationConfigApplicationContext();
		//把一个class转成bd,最后put到map
		//map位置 DefaultListableBeanFactory的属性 beanDefinitionMap
		annotationConfigApplicationContext.register(AppConfig.class);
		//annotationConfigApplicationContext.addBeanFactoryPostProcessor(new TestBeanFactoryPostProcessor());
		//初始化spring的环境
		annotationConfigApplicationContext.refresh();

		TestDao testDao = annotationConfigApplicationContext.getBean(TestDao.class);
		testDao.query();
		/*TestDao testDao1 = annotationConfigApplicationContext.getBean(TestDao.class);
		System.out.println(testDao.hashCode()+"-----"+testDao1.hashCode());*/

		//testDao.query();
		//查看cglib class文件的命令:
		//java classpath "C:\Program Files\Java\jdk1.8.0_181\lib\sa-jdi.exe" sum.jvm.hotspot.HSDB
		/*Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(IndexDao2.class);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
		enhancer.setCallback(new MyMethodInterceptor());
		IndexDao2 dao2 = (IndexDao2) enhancer.create();
		dao2.query();*/
	}
}
