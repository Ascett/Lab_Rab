import java.util.Scanner;
import java.util.stream.Stream;

import static java.lang.Math.*;

public class Lab_1 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        task_1();
        task_2();
        task_3();
        task_4();
        task_5();
        task_6();
       /* task_7();*/
        task_8();
    }

    public static void task_7() {
        System.out.println("Задание №7 - Найти сумму n членов ряда ");
        double s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество шагов:");
        int n = sc.nextInt();
        System.out.println("Введите значение x:");
        double X = sc.nextInt();
        System.out.println("Введите значение a:");
        double A1 = sc.nextInt();
        sc.close();
        for (int i = 1; i <= n; i++) {
            s += pow((X * log(A1)), i) / factorial(i);
        }
        System.out.println(s);
    }

    public static void task_1() {
        System.out.println("Задание №1 - Вычислить значения выражения по формуле");
        System.out.println("Введите значение x:");
        float x = sc.nextInt();
        float a = (float) ((abs(pow(x,2)-pow(x,3)))-((7*x)/(pow(x,3)-(15*x))));
        System.out.println("Ответ:" + a);
        System.out.println(" ");
    }

    public static void task_2() {
        System.out.println("Задание №2 - Вычислить корни квадратного уравнения ах2 + bx + с = 0, заданного коэффициентами a, b и с ");
        System.out.println("Введите значение a:");
        double A = sc.nextInt();
        System.out.println("Введите значение b:");
        double b = sc.nextInt();
        System.out.println("Введите значение c:");
        double c = sc.nextInt();
        double D = (b*b)-(4*A*c);
        double x1 =(-b + sqrt(D))/(2*A);
        double x2 =(-b - sqrt(D))/(2*A);
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
        System.out.println(" ");
    }

    public static void task_3() {
        System.out.println("Задание №3 - Подсчитать количество положительных чисел среди чисел а, b, c ");
        System.out.println("Введите значение a:");
        int a1 = sc.nextInt();
        System.out.println("Введите значение b:");
        int b1 = sc.nextInt();
        System.out.println("Введите значение c:");
        int c1 = sc.nextInt();
        System.out.println("Кол-во положительных чисел:");
        System.out.println(Stream.of(a1, b1, c1).filter(X->X>0).count());
        System.out.println(" ");
    }

    public static void task_4() {
        System.out.println("Задание №4 - Если сумма трех попарно различных действительных чисел X, Y, Z меньше единицы, то наименьшее из этих трех чисел заменить полусуммой двух других; в противном случае заменить меньшее из X, Y полусуммой двух оставшихся значений ");
        double min = 0;
        System.out.println("Введите значение x:");
        double X1 = sc.nextInt();
        System.out.println("Введите значение y:");
        double y1 = sc.nextInt();
        System.out.println("Введите значение z:");
        double z1 = sc.nextInt();
        while ((X1==y1) || (X1==z1) || (y1==z1)){
            min =X1;
            X1 = (y1+z1)/2;
        }
        if (X1+y1+z1<1){
            if (y1<min){
                y1=(X1+z1)/2;
            }
            if (z1<min){
                z1=(X1+y1)/2;
            }
        }
        else if (X1>y1){
            y1=(X1+z1)/2;
        }
        else{
            X1 = (y1+z1)/2;
        }
        System.out.println("Измененые числа:" + X1 + ' ' + y1 + ' ' + z1);
        System.out.println(" ");
    }

    public static void task_5() {
        System.out.println("Задание №5 - Написать программу, которая по данному натуральному числу от 1 до 12 (номеру месяца)" +
                " выдает все приходящиеся на этот месяц праздничные дни ");
        System.out.println("Введите номер месяца:");
        int day = sc.nextInt();
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
                break;
        }
        System.out.println(" ");
    }

    public static void task_6() {
        System.out.println("Задание №6 - Напечатать все совершенные числа, меньшие заданного числа N ");
        System.out.println("Введите N:");
        int N = sc.nextInt();
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
        System.out.println(" ");
    }
    public static void task_8() {
        System.out.println("Введите N:");
        int N = sc.nextInt();
        int i = -1;
        int s =0;
        while (i<N){
            i+=2;
            s+=i;
        }
        System.out.println("Сумма равна:" + s);
    }

    public static int factorial(int n) {
        int p = 1;
        return n == 0 ? p : p * n * (factorial(n-1));

    }
}
