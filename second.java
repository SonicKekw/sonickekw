import java.util.Scanner;

public class second {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите первое число: ");
        double a;
        a = scanner.nextDouble();


        System.out.println("Введите второе число: ");
        double b;
        b = scanner.nextDouble();


        System.out.println("Введите математический оператор: ");
        char c;
        c = scanner.next().charAt(0);


        if (c == '/') {
            System.out.println(a / b);
        } else if (c == '*') {
            System.out.println(a * b);
        } else if (c == '+') {
            System.out.println(a + b);
        } else if (c == '-') {
            System.out.println(a - b);
        }
        else {
            System.out.println("Ошибка");
        }
    }
}