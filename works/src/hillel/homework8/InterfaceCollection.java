package hillel.homework8;

public interface InterfaceCollection {
    String get(int index);

    int size();

    boolean add(String value);

    String add(String value, int index);

    String remove(int index);

    String remove(String value);

    boolean contains(String value);

    boolean clear();
}
