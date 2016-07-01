package jbx;

import static jbx.JbxIO.println;

import org.junit.Test;

public class TestJbxIO {

	@Test
	public void test() {
		println("println %s.", "test");
		JbxIO.printf("printf ");
		JbxIO.printf("%s.\n", "test");
	}
}
