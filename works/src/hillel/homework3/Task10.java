package hillel.homework3;

public class Task10 {
    public static void main(String[] args) {
        int[] array = {12, 8, 2, -1, 14, 5, 10, 7};
        int max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Максимальный элемент: " + max);
    }
}
