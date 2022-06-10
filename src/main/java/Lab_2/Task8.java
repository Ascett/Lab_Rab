package Lab_2;

import utils.FileUtils;

public class Task8 extends Task{
    private int N;
    private int i;
    private int s;
    @Override
    protected void initParamsByKeyboard() {
        System.out.println("Введите N:");
        int N = sc.nextInt();
    }

    @Override
    protected void initParamsByFile() {
        N = (int) Float.parseFloat((String) FileUtils.readParams("Task_8.txt").get(0));
    }

    @Override
    protected void calculateTask() {
         i = -1;
         s =0;
        while (i<N){
            i+=2;
            s+=i;
        }

    }

    @Override
    protected void logResult() {
        System.out.println("Сумма равна:" + s);

    }

    @Override
    protected boolean checkParams() {
        return true;
    }
}
