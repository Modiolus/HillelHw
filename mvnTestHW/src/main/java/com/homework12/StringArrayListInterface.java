package com.homework12;

import java.util.Arrays;
import java.util.Objects;

public class StringArrayListInterface {

    private String[] elements;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public StringArrayListInterface() {
        this.elements = new String[DEFAULT_CAPACITY];
    }

   // @Override
    public String get(int index) {
        isIndexExist(index);
        return elements[index];

    }

 //   @Override
    public int size() {
        return size;
    }

 //   @Override
    public boolean add(String value) {

        if (size == elements.length) {
            elements = increaseCapacity();
        }

        elements[size] = value;

        size++;
        return true;
    }

  //  @Override
    public boolean add(String value, int index) {
        isIndexExist(index);
        String[] temp = elements;
        elements = new String[temp.length + 1];

        elements[index] = value;
        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index, elements, index + 1, temp.length - index);
        size++;
        return true;

    }

   // @Override
    public String toString() {
        String[] temp = new String[size];
        System.arraycopy(elements, 0, temp, 0, size);
        return Arrays.toString(temp);
    }

   // @Override
    public boolean delete(int index) {
        isIndexExist(index);
        String[] temp = elements;
        elements = new String[temp.length - 1];
        String value = temp[index];

        System.arraycopy(temp, 0, elements, 0, index);
        System.arraycopy(temp, index + 1, elements, index, temp.length - index - 1);

        size--;
        return true;
    }

   // @Override
    public boolean delete(String value) {
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
        return true;

    }

   // @Override
    public boolean clear() {
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;

        }
        size = 0;

        return true;
    }

   // @Override
    public boolean contain(String value) {
        for (int i = 0; i < elements.length; i++) {
            if (elements[i] == value) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StringArrayListInterface that = (StringArrayListInterface) o;
        return size == that.size &&
                Arrays.equals(elements, that.elements);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(size);
        result = 31 * result + Arrays.hashCode(elements);
        return result;
    }

    private String[] increaseCapacity() {
        String[] temp = new String[(elements.length * 2)];
        System.arraycopy(elements, 0, temp, 0, elements.length);

        return temp;
    }

    private int isIndexExist(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Element can`t be found! " + "Number of elements in array = " + size +
                    ". Total size of array = " + elements.length);

        }
        return index;
    }

}
