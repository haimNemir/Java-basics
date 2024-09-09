package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;


public class Stream {
    private ArrayList<Integer> numbers = new ArrayList<>();

    public Stream() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(25);
        numbers.add(26);
        numbers.add(32);
        numbers.add(762);
        numbers.add(193829);
        numbers.add(95);
        numbers.add(61);
        numbers.add(-867);
        this.numbers =numbers;
    }

    public static void initialConst(){
        Stream stream = new Stream();
    }

    Predicate<Superhero> checkCanFly = superhero -> superhero.isCanFly();

    //+stream work only on Lists and not on individuals
    public void checkIsSuperman(){
        Predicate<Superhero> isSuperman = superhero -> superhero.getNickName().contains("Superman");
        System.out.println(isSuperman.test(new Superhero("Superman", "can band metal", true)));
    }

    public void filterString(){
        ArrayList<String> names = new ArrayList<>();
        names.add("yoni");
        names.add("yoi");
        names.add("Roy");
        names.add("Pony");
        names.add("Tonny");
        names.add("Johnny");
        for (String name: names){
            if (name.length() == 4){
                System.out.println(name);
            }
        }
    }

    public void filterStreamString(){
        ArrayList<String> names = new ArrayList<>();
        names.add("yoni");
        names.add("yoi");
        names.add("Roy");
        names.add("Pony");
        names.add("Tonny");
        names.add("Johnny");
        names.stream().filter(name->name.length()==4).forEach(n-> System.out.println(n));//+we call to stream for the filter method of him. and filter calls Predicate Object that get one param and return boolean. stream save copy of the filtered variables from the list on him, and we can convert it to list if we add dote in the end of the line (".toList")
    }

    public void getNumberFromSupplier(){
        Supplier<Integer> supplier = ()->(int)(Math.random()*100);// supplier provided what ever you want if you enter Type of object and logic.
        System.out.println(supplier);
    }

    public void setNumberToConsumer(){// consumer take element and do with it something with no returns
        Consumer<Superhero> consumer = superhero-> System.out.println(superhero.getNickName());
        consumer.accept(new Superhero("Batman", "i'm rich", false));
    }

    public void streamForEach(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(25);
        numbers.add(26);
        numbers.add(32);
        numbers.add(7);

        java.util.stream.Stream<Integer> stream = numbers.stream().filter(number->number%2!=0);
        numbers.stream().filter(number->number%2==0).forEach(num-> System.out.println(num)); //+ before we entered logic in filter, numbers.stream was only with a references to numbers list but after we entered logic he did create "stream" that contains only the filtered numbers. .forEach(number-> System.out.println(number)); // .forEach required Consumer, and forEach is "Terminator" this mean after he was run the reference is closed and you cant call him again even you saved him on Steam object, unless you saved in List like next code line.
        List<Integer> oddNumbers = numbers.stream().filter(number->number%2!=0).toList();
    }

    public void manyFilters(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(25);
        numbers.add(26);
        numbers.add(32);
        numbers.add(762);
        numbers.add(193829);
        numbers.add(28);
        numbers.add(95);
        numbers.add(61);
        numbers.add(-867);
        //makes many filters on the same List.
        List<Integer> sortedNumbers = numbers.stream().filter(number->number<999).filter(number->number>0).filter(number->number%2==0).toList();
    }

    public void streamMap(){
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(25);
        numbers.add(26);
        numbers.add(32);
        numbers.add(762);
        numbers.add(193829);
        numbers.add(28);
        numbers.add(95);
        numbers.add(61);
        numbers.add(-867);
//        +numbers.stream().map(num -> num+"ABC") change the type of the variables in stream. map required 2 parameters: the first is what we get and the second is for what we want to change this parameter, here the second param is +"ABC" so its mast be String.
        numbers.stream().map(num -> num+"ABC").forEach(string-> System.out.println(string));
    }

    public void methodeReference() {
        numbers.stream().map(num -> num+"ABC").forEach(Stream::printString); // methode Reference: left side:: = name of the class, ::right side = name of the method and because method .forEach demand parameter and provide result, we can use this method here.
    }

    public static void printString(String string) {// belong to method: methodeReference.
        System.out.println(string);
    }

    public void parallelStreamFunction() {
        System.out.println(numbers.parallelStream().filter(num->num%2==0)); // .parallelStream = multi Thread filter the list in the same time, its Stream Thread.
    }

    public void intStream() {
        IntStream intStream = IntStream.builder().add(1).add(2).add(3).build();
        System.out.println(intStream.sum()); // IntStream is an Object Stream that initialize to int and its give to us some benefits like: sum(), average(). and more methods that have only for him.
    }

    // there is in the computer in my room more info about this topic
}

