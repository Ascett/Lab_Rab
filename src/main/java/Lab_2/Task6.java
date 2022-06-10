package Lab_2;

import utils.FileUtils;

public class Task6 extends Task{
    private int N;

    @Override
    protected void initParamsByKeyboard() {
        N = sc.nextInt();

    }

    @Override
    protected void initParamsByFile() {
        N = (int) Float.parseFloat((String) FileUtils.readParams("Task_6.txt").get(0));
    }

    @Override
    protected void calculateTask() {
        for (int i = 1; i<N; i++){
            int summ =0;
            for (int j = 1; j<=(i/2); j++){
                if ((i % j) == 0){
                    summ+=j;
                }
            }
            if (summ==i){
                System.out.println(i);
            }
        }

    }

    @Override
    protected void logResult() {

    }

    @Override
    protected boolean checkParams() {
        return true;
    }
}
