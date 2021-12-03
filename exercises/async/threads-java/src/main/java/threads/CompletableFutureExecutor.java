package threads;

import java.util.concurrent.CompletableFuture;
import internal.HeavyComputation;
import internal.HeavyComputation.ComputationResult;
import internal.SleepPrinter;

import java.util.Random;

public class CompletableFutureExecutor implements AsyncExecutor {

    @Override
    public ComputationResult execute(HeavyComputation comp, String[] params) {
        // TODO add async computation using CompletableFuture here and return result of the computation
    	CompletableFuture<ComputationResult> futureResult =  CompletableFuture.supplyAsync(() -> {
        	SleepPrinter.printAfter("Continue executing...", 1);
        	SleepPrinter.printAfter("Can do other tasks in-between", new Random().nextInt(10));
        	return null;
        });
        return futureResult.join();
    }
}
