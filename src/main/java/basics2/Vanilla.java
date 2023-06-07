package basics2;

import org.springframework.stereotype.Component;

@Component
public class Vanilla implements Icecream {

	public void open() {
		System.out.println("Vanilla icecream is opened");
		
	}
	

}
