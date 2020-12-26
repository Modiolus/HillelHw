package homework12;

import com.homework12.StreamOperations;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;

public class StreamOperationsTest {

    @Test
    void testAverage() {
        List<Integer> testList = List.of(2, 1, 6);
        Assertions.assertEquals(3, StreamOperations.average(testList));
    }

    @Test
    void testToUppercase() {
        List<String> str = List.of("one", "two", "three", "four");
        Map<String, String> map = str.stream()
                .collect(Collectors.toMap(i -> i, i -> i.toUpperCase()));
        Assertions.assertEquals(map, StreamOperations.toUpper(str));
    }
    @Test
    void testFilter(){
        List<String> listStr = List.of("Green", "Grey", "orange", "blue", "Black", "white", "Red", "pink");
        List<String>list = listStr.stream()
                .filter(e -> e.contains(e.toLowerCase()) && e.length() == 4)
                .collect(Collectors.toList());
        Assertions.assertEquals(list, StreamOperations.filter(listStr));
    }


}
