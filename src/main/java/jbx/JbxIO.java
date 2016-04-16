package jbx;

import static java.lang.String.format;

public class JbxIO {
	public static void println(String format, Object... args) {
		System.out.println(format(format, args));
	}
	
	public static void printf(String format, Object... args) {
		System.out.print(format(format, args));
	}
}
