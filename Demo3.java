package chandru;

import org.testng.annotations.Test;

public class Demo3 {
@Test(enabled = false)

public void highSchool() {
	System.out.println("highSchool");
}


@Test(enabled = true)
public void higher() {
	System.out.println("higher");
}



@Test(dependsOnMethods = "higher")
public void collage() {
	System.out.println("collage");
}}