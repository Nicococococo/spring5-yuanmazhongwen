package spring;

public class OrderService {
	static{
		System.out.println("==================OrderServicee静态初始化块=======================");
	}

	{
		System.out.println("==================OrderService初始化块=======================");
	}

	public OrderService(){
		System.out.println("==================OrderService构造方法=======================");
	}
}
