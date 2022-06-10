import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Test {
    public static void main(String[] args) {
        System.out.println("Задание №7 - Найти сумму n членов ряда ");
        double s = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество шагов:");
        double n = sc.nextInt();
        System.out.println("Введите значение x:");
        double X = sc.nextInt();
        sc.close();
        double A1 = 1;
        for (int i = 1; i < n; i++) {
        }
        System.out.println(s);
    }
}
