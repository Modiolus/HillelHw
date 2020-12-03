package hillel.homework7;

import java.util.Arrays;

public class StringArrayList {
    private String[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public StringArrayList() {
        this.elements = new String[DEFAULT_CAPACITY];
    }

    public String get(int index) {
        return elements[index];

    }

    public int size() {
        return size;
    }

    public boolean add(String value) {

        if (size == elements.length) {
            elements = increaseCapacity();
        }

        elements[size] = value;

        size++;
        return true;
    }

    private String[] increaseCapacity() {
        String[] temp = new String[(elements.length * 2)];
        System.arraycopy(elements, 0, temp, 0, elements.length);

        return temp;
    }

    public String add(String value, int index) {
        String[] temp = elements;
        elements = new String[temp.length + 1];

        elements[index] = value;
        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index, elements, index + 1, temp.length - index);
        size++;
        return value;

    }

    @Override
    public String toString() {
        String[] temp = new String[size];
        System.arraycopy(elements, 0, temp, 0, size);
        return Arrays.toString(temp);
    }

    public String remove(int index) {
        String[] temp = elements;
        elements = new String[temp.length - 1];
        String value = temp[index];

        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);

        size--;
        return value;
    }

    public String remove(String value) {
        int index = 0;
        String[] temp = elements;
        elements = new String[temp.length - 1];
        for (int i = 0; i < temp.length; i++) {
            if (temp[i] == value) {
                index = i;
                String buf = value;
            }
        }
        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);

        size--;
        return value;

    }

    public static void main(String[] args) {
        StringArrayList str = new StringArrayList();
        System.out.println("Add value: ");
        str.add("Samsung");
        str.add("Apple");
        str.add("Philips");
        str.add("Acer");
        str.add("Asus");
        str.add("Dell");
        str.add("Xiaomi");
        str.add("HP");
        str.add("Lenovo");
        str.add("Seiko");
        System.out.println(str);

        System.out.println("Add value and index: ");
        str.add("Test", 1);
        System.out.println(str);
        System.out.println("Remove of value: ");
        str.remove("Apple");
        System.out.println(str);
        System.out.println("Remove of value on index: ");
        str.remove(4);
        System.out.println(str);

        System.out.println("Getting element of 6 index: " + str.get(6));
        System.out.println("Size of array: " + str.size());

    }
}