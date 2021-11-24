package com.test.processor.factory;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

/*
 * Created by wlx on 2020/2/5
 */
public class TestBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		AnnotatedBeanDefinition annotatedBeanDefinition = (AnnotatedBeanDefinition)beanFactory.getBeanDefinition("testDao");
		annotatedBeanDefinition.setScope("prototype");
	}
}
