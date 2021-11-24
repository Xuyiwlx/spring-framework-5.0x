package com.test.app;

import com.test.dao.Dao;
import com.test.dao.IndexDao1;
import com.test.dao.IndexDao2;
import org.springframework.context.annotation.*;

/*
 * Created by wlx on 2020/2/4
 */
@ComponentScan("com.test")
@Configuration
public class AppConfig {

	/*@Bean
	public Dao indexDao1() {
		return new IndexDao1();
	}

	@Bean
	public Dao indexDao2() {
		indexDao1();
		return new IndexDao2();
	}*/
}
