

import java.util.Scanner;

public class NameAndPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя пользователя: ");
        String name = sc.nextLine();
        System.out.println("Введите пароль: ");
        String pw = sc.nextLine();
        if (pw.length() < 8 || pw.length() > 15) {
            do {
                System.out.println("Пароль должен быть от 8 до 15 символов!");
                pw = sc.nextLine();
            } while (pw.length() < 8 || pw.length() > 15);
        }
        System.out.printf("%s,Ваш новый пароль:%s", name, pw);
    }
}

