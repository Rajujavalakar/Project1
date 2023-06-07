package basics1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testbike {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("ioc1.xml");
		Bike bike=(Bike) context.getBean("bike");
		bike.price();
	}

}
