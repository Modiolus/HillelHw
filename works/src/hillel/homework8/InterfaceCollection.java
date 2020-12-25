package hillel.homework8;

public interface InterfaceCollection {
    //int a; //убрать
    boolean add(String value);

    boolean add(String value, int index);

    boolean delete(String value);

    boolean delete(int index);

    String get(int index);

    boolean contain(String value);

    boolean clear();

    int size();
}
