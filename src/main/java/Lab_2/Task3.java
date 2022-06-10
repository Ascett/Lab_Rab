package Lab_2;

import utils.FileUtils;

import java.util.stream.Stream;

public class Task3  extends Task{
    private int a;
    private int b;
    private int c;
    @Override
    protected void initParamsByKeyboard() {
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
    }

    @Override
    protected void initParamsByFile() {
        a = (int) Float.parseFloat((String) FileUtils.readParams("Task_3.txt").get(0));
        b = (int) Float.parseFloat((String) FileUtils.readParams("Task_3.txt").get(1));
        c = (int) Float.parseFloat((String) FileUtils.readParams("Task_3.txt").get(2));
    }

    @Override
    protected void calculateTask() {
    }

    @Override
    protected void logResult() {
        LOGGER.info(Stream.of(a, b, c).filter(X->X>0).count());
    }

    @Override
    protected boolean checkParams() {
        return true;
    }
}
