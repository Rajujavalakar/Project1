package basics2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Babydriver {
	public static void main(String[] args) {
		ApplicationContext applicationContext=new AnnotationConfigApplicationContext(ConfigAnnotation.class);
				Baby baby=(Baby) applicationContext.getBean("baby");
				baby.eat();
		
	}

}
