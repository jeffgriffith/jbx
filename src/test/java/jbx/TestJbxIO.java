package jbx;

import static jbx.JbxIO.println;

import org.junit.Test;

public class TestJbxIO {

	@Test
	public void test() {
		println("Println %s.", "test");
		JbxIO.printf("Printlf ");
		JbxIO.printf("%s.\n", "test");
	}
}
