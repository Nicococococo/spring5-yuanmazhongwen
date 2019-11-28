package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("spring")
@Configuration
public class AppConfig {

	static{
		System.out.println("==================AppConfig静态初始化块=======================");
	}

	{
		System.out.println("==================AppConfig初始化块=======================");
	}

	public AppConfig(){
		System.out.println("==================AppConfig构造方法=======================");
	}

	@Bean
	public OrderService getOrderService(){
		getUserService();
		return new OrderService();
	}

	@Bean
	public UserService getUserService(){
		return new UserService();
	}



}
