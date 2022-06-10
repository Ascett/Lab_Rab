package Lab_2;

import utils.FileUtils;
import static java.lang.Math.*;

import static java.lang.Math.log;
import static java.lang.Math.pow;

public class Task7 extends Task{
    private double s = 0;
    private int n;
    private double X;
    private double A1;
    @Override
    protected void initParamsByKeyboard() {
        n = sc.nextInt();
        X = sc.nextInt();
        A1 = sc.nextInt();
    }

    @Override
    protected void initParamsByFile() {
        n = (int) Float.parseFloat((String) FileUtils.readParams("Task_7.txt").get(0));
        X = (int) Float.parseFloat((String) FileUtils.readParams("Task_7.txt").get(1));
        A1 = (int) Float.parseFloat((String) FileUtils.readParams("Task_7.txt").get(2));

    }

    @Override
    protected void calculateTask() {
        System.out.println("Задание №7 - Найти сумму n членов ряда ");
        for (int i = 1; i <= n; i++) {
            s += pow((X * log(A1)), i) / factorial(i);
        }

    }

    @Override
    protected void logResult() {
        System.out.println(s);

    }

    @Override
    protected boolean checkParams() {
        return true;
    }

    public static int factorial(int n) {
        int p = 1;
        return n == 0 ? p : p * n * (factorial(n-1));

    }
}

