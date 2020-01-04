package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("spring")
@Configuration
/**
 * lite @Bean mode ：当@Bean方法在没有使用@Configuration注解的类中声明时称之为lite @Bean mode
 * Full @Configuration：如果@Bean方法在使用@Configuration注解的类中声明时称之为Full @Configuration   这样的会做cglib动态代理
 * 主要根据是否有@Configuration来决定（spring的full和lite：full就是全配置类 使用@Configuration  lite就是部分配置类 不用该注解） 存在则cglib动态代理  不存在就跳过
 * 源码在ConfigurationClassPostProcessor类postProcessBeanFactory()方法中
 */
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
