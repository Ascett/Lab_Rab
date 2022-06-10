package Lab4;

import java.util.concurrent.locks.ReentrantLock;

public class CheckRunner {

    public static ReentrantLock lock;
    public static PrimeCheckList list;

    public static void init(int numbersToCheck) {
        list = new PrimeCheckList();
        lock = new ReentrantLock();
        list.fill(numbersToCheck);
    }

    public static ReentrantLock getLock() {
        return lock;
    }

    public static void setLock(ReentrantLock lock) {
        CheckRunner.lock = lock;
    }

    public static PrimeCheckList getList() {
        return list;
    }

    public static void setList(PrimeCheckList list) {
        CheckRunner.list = list;
    }
}
