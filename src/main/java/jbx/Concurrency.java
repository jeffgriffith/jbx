package jbx;

import java.util.concurrent.ForkJoinPool;

public class Concurrency {

	public static void go(Runnable task) {
		ForkJoinPool.commonPool().submit(task);
	}
}
