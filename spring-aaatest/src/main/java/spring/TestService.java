package spring;

import org.springframework.stereotype.Component;

@Component
public class TestService {

	static{
		System.out.println("==================TestService静态初始化块=======================");
	}

	{
		System.out.println("==================TestService初始化块=======================");
	}

	public TestService(){
		System.out.println("==================TestService构造方法=======================");
	}

}
