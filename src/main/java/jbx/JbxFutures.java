package jbx;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class JbxFutures {
    public static <T> CompletableFuture<T> future() {
        return new CompletableFuture<T>();
    }
	
	// Nurkiewitz.com
    public static <T> CompletableFuture<List<T>> joinFutures(List<CompletableFuture<T>> futures) {
        CompletableFuture<Void> allDoneFuture = CompletableFuture.allOf(
        		futures.toArray(new CompletableFuture[futures.size()]));
        
        return allDoneFuture.thenApply(v -> futures.stream()
        				.map(future -> future.join())
        				.collect(Collectors.<T>toList()));
    }
}
