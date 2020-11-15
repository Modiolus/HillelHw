package hillel.homework3;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {
        int[] array = {12, 8, 2, -1, 14, 5, 10, 7};
        int min = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальный элемент: " + min);
    }
}
