package Stream;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Predicate<String> checkLength = str -> str.length() < 10;
//        System.out.println(checkLength.test("123456789"));
//        System.out.println(checkLength.test("1234567890"));
        List<String> strings = List.of("1", "2", "3");

        Stream stream = new Stream();
//        stream.checkIsSuperman();

//        stream.filterString();
//        stream.streamForEach();
//        stream.streamMap();
//        stream.methodeReference();
//        stream.intStream();






    }
}
