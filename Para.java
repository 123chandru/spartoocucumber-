package chandru;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para {
@Test
@Parameters("chu")
		public void Name(String name) {
		System.out.println("name is"+  name);
		
	}

}

