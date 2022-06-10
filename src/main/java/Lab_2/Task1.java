package Lab_2;

import utils.FileUtils;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Task1 extends Task {

    private float x;
    private float answer;

    @Override
    protected void initParamsByKeyboard() {
        x = sc.nextFloat();
    }

    @Override
    protected void initParamsByFile() {
        x = Float.parseFloat((String) FileUtils.readParams("Task_1.txt").get(0));
    }

    @Override
    protected void calculateTask() {
         answer = (float) ((abs(pow(x,2)-pow(x,3)))-((7*x)/(pow(x,3)-(15*x))));
    }

    @Override
    protected void logResult() {
        LOGGER.info("Ответ:" + answer);
    }

    @Override
    protected boolean checkParams() {
        return true;
    }

}
