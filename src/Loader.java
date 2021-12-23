import java.util.Scanner;

public class Loader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите оценку от 1 до 5");
        String ocenkiMoi = scanner.nextLine();
        String otlichnic = ocenkiMoi.replaceAll("2", "5");
        System.out.println(otlichnic);

    }
}