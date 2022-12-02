package chandru;

import org.testng.annotations.Test;

public class Grouping {
@Test(groups = {"football"})
	public void football() {
         System.out.println("football");
	}
@Test(groups = {"vollyBall"})
	public void vollyBall() {
		System.out.println("vollyBall");
    }
@Test(groups = {"cricket"})
	public void cricket() {
		System.out.println("cricket");

	}
@Test(groups = {"basketBall"})
	public void basketBall() {
		System.out.println("basketBall");

	}
@Test(groups = {"carrom"})
	public void carrom() {
		System.out.println("carrom");

	}
@Test(groups = {"chess"})
	public void chess() {
		System.out.println("chess");

	}
	}

