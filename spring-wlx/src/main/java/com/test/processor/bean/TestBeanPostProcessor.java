package com.test.processor.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/*
 * Created by wlx on 2020/2/5
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor , PriorityOrdered {
	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("testDao")) {
			System.out.println("BeforeInitialization0");
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (beanName.equals("testDao")) {
			System.out.println("AfterInitialization0");
		}
		return bean;
	}

	@Override
	public int getOrder() {
		return 0;
	}
}
