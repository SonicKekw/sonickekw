import java.util.Scanner;
public class first {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите имя: ");
        String name = scanner.nextLine();

        System.out.print("Введите рост: ");
        int height;
        height = scanner.nextInt();

        System.out.print("Введите вес: ");
        double weight;
        weight = scanner.nextDouble();

        System.out.println("Ваше имя: " + name);
        System.out.println("Ваш рост: " + height);
        System.out.println("Ваш вес: " + weight);
    }
}
