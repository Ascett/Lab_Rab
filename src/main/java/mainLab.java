import Lab4.CheckRunner;
import Lab4.PrimeChecker;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class mainLab {

    private static ExecutorService es;
    private static final int NUMBERS_TO_CHECK = 5000;

    public static void main(String[] args) {
        CheckRunner.init(NUMBERS_TO_CHECK);
        es = Executors.newCachedThreadPool();
        int threadCount = NUMBERS_TO_CHECK / 100 * 10;
        IntStream.range(0, threadCount).forEach(i -> es.submit(new PrimeChecker()));
        es.shutdown();
    }


}
