package HW2;

public class Main {

    public static void main(String[] args) {

    }

    public static boolean xx(int a, int b) {
        a = 10;
        b = 5;
        int sum = a + b;
        if (sum > 10 && sum < 20) {
            System.out.println("Сумма в пределах от 10 до 20");
            return true;
        } else {
            System.out.println("Сумма находится не в пределах от 10 до 20");
            return false;
        }

    }

    public static void xx_2(int a) {
        a = 0;
        if (a >= 0) {
            System.out.println("Значение положительное");
        } else {
            System.out.println("Значение отрицательное");
        }
    }

    public static boolean xx_3(int a) {
        a = 5;
        if (a >= 0) {
            System.out.println("Значение положительное");
            return false;
        } else {
            System.out.println("Значение отрицательное");
            return true;
        }
    }

    public static void xx_4(String how, int much) {
        how = "word";
        for (much = 0; much < 10; much++) {
            System.out.println(how);
        }
    }
}
