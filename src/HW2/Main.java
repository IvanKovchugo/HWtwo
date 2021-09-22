package HW2;

public class Main {

    public static void main(String[] args) {
        xx();
    }
    public static boolean xx (int a, int b) {
        a = 10;
        b = 5;
        int sum = a + b;
        if (sum > 10 && sum < 20 ) {
            System.out.println("Сумма в пределах от 10 до 20");
            return true;
        }
        else {
            System.out.println("Сумма находится не в пределах от 10 до 20");
            return false;
        }

    }
}
