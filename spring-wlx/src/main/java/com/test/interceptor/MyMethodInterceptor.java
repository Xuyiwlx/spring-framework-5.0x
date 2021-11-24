package com.test.interceptor;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/*
 * Created by wlx on 2020/2/9
 */
public class MyMethodInterceptor implements MethodInterceptor {
	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("method---");
		return methodProxy.invokeSuper(o,objects);

	}
}
