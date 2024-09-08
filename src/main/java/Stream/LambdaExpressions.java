package Stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class LambdaExpressions {
    public LambdaExpressions() {
    }

    public void getReversSortedList(){
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 12; i++) {
            numbers.add(i, random.nextInt(0, 101));
//            numbers.add(i, Math.random());
        }
        System.out.println("Unsorted list: ");
        for (int number : numbers) {
            System.out.println(number);
        }

        Collections.sort(numbers, (o1, o2) -> o2 - o1);

        System.out.println("Sorted list: ");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public void runThread(){
        Thread thread = new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        });
    }

    public void predicate(){
        Predicate<String> checkLength = str->str.length()<10;// JAVA.Util.Function
        System.out.println(checkLength.test("123456789"));
    }

    public void checkIfCanFly(Superhero superhero){
    Predicate<Superhero> checkCanFly = superhero1->superhero.isCanFly();
        System.out.println(checkCanFly);
    }
}
