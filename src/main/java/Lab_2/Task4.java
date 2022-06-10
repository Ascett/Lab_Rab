package Lab_2;

import utils.FileUtils;

import java.util.stream.Stream;

public class Task4 extends Task{

    private double x;
    private double y;
    private double z;
    private double min;
    @Override
    protected void initParamsByKeyboard() {
        x = sc.nextInt();
        y = sc.nextInt();
        z = sc.nextInt();
    }

    @Override
    protected void initParamsByFile() {
        x = (int) Float.parseFloat((String) FileUtils.readParams("Task_4.txt").get(0));
        y = (int) Float.parseFloat((String) FileUtils.readParams("Task_4.txt").get(1));
        z = (int) Float.parseFloat((String) FileUtils.readParams("Task_4.txt").get(2));
    }

    @Override
    protected void calculateTask() {
        min = 0;
        while ((x==y) || (x==z) || (y==z)){
            min =x;
            x = (y+z)/2;
        }
        if (x+y+z<1){
            if (y<min){
                y=(x+z)/2;
            }
            if (z<min){
                z=(x+y)/2;
            }
        }
        else if (x>y){
            y=(x+z)/2;
        }
        else{
            x = (y+z)/2;
        }
    }

    @Override
    protected void logResult() {
        System.out.println("Измененые числа:" + x + ' ' + y + ' ' + z);
        System.out.println(" ");
    }

    @Override
    protected boolean checkParams() {
        return true;
    }
}
