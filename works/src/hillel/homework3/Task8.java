package hillel.homework3;

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {

        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = i + i + 1;
        }

        for (int i = 0; i < array.length; i++) {
        }
        System.out.println(Arrays.toString(array));
    }
}
