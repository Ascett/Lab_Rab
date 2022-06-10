package Lab4;

import java.util.stream.IntStream;

public class PrimeChecker implements Runnable {

    @Override
    public void run() {
        while(CheckRunner.getList().hasAnyUnchecked()) {
            try {
                CheckRunner.getLock().lock();
                int currentNumber = CheckRunner.getList().pick();
                System.out.println(Thread.currentThread().getName() + " Проверяет число " + currentNumber);
                System.out.println(primeCheck(currentNumber) ? Thread.currentThread().getName() + ": Число " + currentNumber + " не является простым" :
                        Thread.currentThread().getName() + ": Число " + currentNumber + " является простым");
                CheckRunner.getList().check(currentNumber);
                System.out.println(CheckRunner.getList().size());
            } finally {
                CheckRunner.getLock().unlock();
            }
        }
    }

    public boolean primeCheck(int number) {
            return IntStream.
                    iterate(3, i -> i <= number / 2, i -> i + 1).
                    anyMatch(i -> number % i == 0);
    }
}
