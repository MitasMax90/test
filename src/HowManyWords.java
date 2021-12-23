import java.util.*;

public class HowManyWords {

    public static void main(String[] args) {
        int arr[] = {5, 24, 3, 66, 38, 16, 27};
        System.out.println("\nСортируем массив! \n");
        Arrays.sort(arr);
        System.out.println("\nОтсортированный массив: \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println("Третий элемент массива: " + arr[2]);

    }
}