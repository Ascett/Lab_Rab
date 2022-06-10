import java.util.Scanner;

public class Lab_0 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число:");
        int a = sc.nextInt();
        System.out.println("Введите второе число:");
        int b = sc.nextInt();
        System.out.println("Введите третье число:");
        int c = sc.nextInt();
        sc.close();
        System.out.println("Числа:" + a + ' ' + b + ' ' + c);
        if ((a==b)||(a==c)||(b==c)){
            a+=5;
            b+=5;
            c+=5;
        }
        else{
            System.out.println("Равных нет!");
        }
        System.out.println("Измененые числа:" + a + ' ' + b + ' ' + c);
    }
    }
