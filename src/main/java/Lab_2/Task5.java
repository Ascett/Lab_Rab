package Lab_2;

import utils.FileUtils;

public class Task5 extends Task{
    private int day;

    @Override
    protected void initParamsByKeyboard() {
        day = sc.nextInt();
    }

    @Override
    protected void initParamsByFile() {
        day = (int) Float.parseFloat((String) FileUtils.readParams("Task_5.txt").get(0));
    }

    @Override
    protected void calculateTask() {
        switch (day){
            case 1:  System.out.println("1 января — Новый год, 7 января — Рождество");
                break;
            case 2:  System.out.println("23 февраля – День защитника Отечества");
                break;
            case 3:  System.out.println("8 марта – Международный женский день");
                break;
            case 4:  System.out.println("1 апреля - День смеха");
                break;
            case 5:  System.out.println("1 мая – Праздник Весны и Труда, 9 мая – День Победы");
                break;
            case 6:  System.out.println("12 июня - День России");
                break;
            case 7:  System.out.println("праздников нет( ");
                break;
            case 8:  System.out.println("праздников нет( ");
                break;
            case 9:  System.out.println("праздников нет( ");
                break;
            case 10:  System.out.println("праздников нет( ");
                break;
            case 11:  System.out.println("4 ноября - День народного единства");
                break;
            case 12:  System.out.println("31 Декабря - выходной");
                break; }
    }

    @Override
    protected void logResult() {

    }

    @Override
    protected boolean checkParams() {
        return true;
    }
}
