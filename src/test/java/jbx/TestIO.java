package jbx;

import static jbx.IO.println;

import org.junit.Test;

public class TestIO {

	@Test
	public void test() {
		println("Println %s.", "test");
		IO.printf("Printlf ");
		IO.printf("%s.\n", "test");
	}
}
