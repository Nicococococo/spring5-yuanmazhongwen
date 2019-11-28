package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	@SuppressWarnings("resource")
	public static void main(String[] args)  {

		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

		//ClassPathXmlApplicationContext c = new ClassPathXmlApplicationContext("spring.xml");

		System.out.println(annotationConfigApplicationContext.getBean(TestService.class));

		//第九次后置处理器（销毁的时候调用）
		annotationConfigApplicationContext.close();

	}

}
