import com.homework12.StringArrayListInterface;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringArrayListInterfaceTest {

    private StringArrayListInterface str;

    @BeforeEach
    public void fill() {
        str = new StringArrayListInterface();
        str.add("Samsung");
        str.add("Apple");
        str.add("Xiaomi");
        str.add("Asus");

    }

    @Test
    public void testGet() {
        Assertions.assertEquals("Xiaomi", str.get(2));

    }

    @Test
    public void testGetNeg() {
        Assertions.assertNotEquals("Acer", str.get(3));

    }

    @Test
    public void testAddValue() {
        Assertions.assertEquals(true, str.add("Apple"));
    }

    @Test
    public void testAddValueIndex() {
        Assertions.assertEquals(true, str.add("Samsung", 0));
    }


    @Test
    public void testDeleteIndex() {
        Assertions.assertEquals(true, str.delete(3));
    }

    @Test
    public void testDeleteIndexNeg() {

        Assertions.assertThrows(IndexOutOfBoundsException.class, () -> str.delete(5));

    }

    @Test
    public void testDeleteValue() {
        Assertions.assertEquals(true, str.delete("Apple"));
    }

    @Test
    public void testClear() {

        Assertions.assertEquals(true, str.clear());
    }

    @Test
    public void testContain() {
        Assertions.assertTrue(str.contain("Xiaomi"));
    }

    @Test
    public void testContainNeg() {
        Assertions.assertFalse(str.contain("Acer"));
    }

    @Test
    public void testEquals() {
        StringArrayListInterface str1 = new StringArrayListInterface();
        str1.add("Samsung");
        str1.add("Apple");
        str1.add("Xiaomi");
        str1.add("Asus");
        Assertions.assertTrue(str.equals(str1));
    }
}
