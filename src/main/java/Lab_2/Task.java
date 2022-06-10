package Lab_2;


import org.apache.log4j.Logger;

import java.util.Scanner;

public abstract class Task {

    protected static final Logger LOGGER = Logger.getLogger(Task.class);
    protected static final Scanner sc = new Scanner(System.in);

    protected abstract void initParamsByKeyboard();

    protected abstract void initParamsByFile();

    protected abstract void calculateTask();

    protected abstract void logResult();

    protected abstract boolean checkParams();

    private void logError() {
        LOGGER.info("Введены не верные параметры");
    }

    public void run(boolean fromFile) {
        if (fromFile) {
            initParamsByFile();
        } else {
            initParamsByKeyboard();
        }
        if (checkParams()) {
            calculateTask();
            logResult();
        } else {
            logError();
        }
    }
}

