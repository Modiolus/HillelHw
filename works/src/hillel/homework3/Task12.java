package hillel.homework3;

public class Task12 {
    public static void main(String[] args) {
        int[] array = {10, 2, 5, 12, 1, 3};
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        double average = (double) sum / array.length;
        System.out.println("Среднее арифметическое всех элементов массива: " + average);
    }
}
