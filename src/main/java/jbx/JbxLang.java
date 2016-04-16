package jbx;

public class JbxLang {
	/**
	 * Sleep the specified number of milliseconds.
	 * @param millis
	 * @return Whether the sleep was interrupted.
	 */
	public static boolean sleep(long millis) {
		try {
			Thread.sleep(millis);
			return false;
		}
		catch (Exception e) {
			return true;
		}
	}
}
