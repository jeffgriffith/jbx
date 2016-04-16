package jbx;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;

public class JbxConcurrent {

	public static void go(Runnable task) {
		ForkJoinPool.commonPool().submit(task);
	}

    public static <T> CompletableFuture<T> future() {
        return new CompletableFuture<T>();
    }
	
    /**
     * Make a list of futures composable. This is missing from the
     * Java 8 feature set. Courtesy nurkiewitz.com.
     */
    public static <T> CompletableFuture<List<T>> joinFutures(List<CompletableFuture<T>> futures) {
    	
        CompletableFuture<Void> allDoneFuture = CompletableFuture.allOf(
        		futures.toArray(new CompletableFuture[futures.size()]));
        
        return allDoneFuture.thenApply(v -> futures.stream()
        				.map(future -> future.join())
        				.collect(Collectors.<T>toList()));
    }
}
