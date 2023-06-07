package basics2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Chocolate implements Icecream {

	public void open() {
	System.out.println("Chocolate icecream is opened");		
	}

}
