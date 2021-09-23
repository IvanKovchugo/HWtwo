package HW2;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean sum = xx(10,5);
        System.out.println(sum );
        xx(10);
        boolean s = xx_2(-1);
        xx_2("World", 15);
        boolean c = x_5(4,100,400);
        System.out.println(x_5(4,100, 400));
    }

    public static boolean xx(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            System.out.println("Сумма в пределах от 10 до 20");
            return true;
        } else {
            System.out.println("Сумма находится не в пределах от 10 до 20");
            return false;
        }

    }

    public static void xx(int a) {
        if (a >= 0) {
            System.out.println("Значение положительное");
        } else {
            System.out.println("Значение отрицательное");
        }
    }

    public static boolean xx_2(int a) {
        if (a >= 0) {
            System.out.println("Значение положительное");
            return false;
        } else {
            System.out.println("Значение отрицательное");
            return true;
        }
    }

    public static void xx_2(String how, int much) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        for (much = 0; much < num; much++) {
            System.out.println(how);
        }
    }
    public static boolean x_5( int a, int b, int c) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        return  ((year % a == 0) || (year % c == 0)) && (year % b!= 0);

    }

}
