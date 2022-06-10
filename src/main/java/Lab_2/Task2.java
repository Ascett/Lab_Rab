package Lab_2;

import utils.FileUtils;

import static java.lang.Math.sqrt;

public class Task2 extends Task{
    private double a;
    private double b;
    private double c;
    private double D;
    private double x1;
    private double x2;
    @Override
    protected void initParamsByKeyboard() {
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
    }

    @Override
    protected void initParamsByFile() {
        a = Float.parseFloat((String) FileUtils.readParams("Task_2.txt").get(0));
        b = Float.parseFloat((String) FileUtils.readParams("Task_2.txt").get(1));
        c = Float.parseFloat((String) FileUtils.readParams("Task_2.txt").get(2));
    }

    @Override
    protected void calculateTask() {
        D = (b*b)-(4*a*c);
        x1 =(-b + sqrt(D))/(2*a);
        x2 =(-b - sqrt(D))/(2*a);
    }

    @Override
    protected void logResult() {
        LOGGER.info("x1 = " + x1);
        LOGGER.info("x2 = " + x2);
    }

    @Override
    protected boolean checkParams() {
        return true;
    }
}
