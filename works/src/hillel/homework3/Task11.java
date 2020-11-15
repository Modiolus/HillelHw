package hillel.homework3;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        int[] array = {4, -5, 0, 6, 8};
        int min = array[0];
        int max = array[0];
        int minIndex = 0;
        int maxIndex = 0;

        System.out.println("Оригинальный массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                maxIndex = j;
            }
        }

        int temp = array[minIndex];
        array[minIndex] = array[maxIndex];
        array[maxIndex] = temp;

        System.out.println("Измененный массив:   " + Arrays.toString(array));

    }
}
