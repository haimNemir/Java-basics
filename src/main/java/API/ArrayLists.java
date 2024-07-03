package API;

import java.util.*;

public class ArrayLists {
    public static void main(String[] args) {
//        ArrayList<Integer> numbers1 = new ArrayList<>(18);
//        numbers1.add(53);
//        numbers1.add(1, 7);
//        numbers1.addFirst(53);
//        numbers1.addLast(53);
//        numbers1.getFirst();
//        numbers1.getLast();
//        numbers1.set(3, 48);
//        ArrayList<Integer> numbers2 = new ArrayList<>(18);
//        numbers2.addAll(numbers1);
//        ArrayList<Objects> arrayList3 = new ArrayList<>();
//        ArrayList<String> strings = new ArrayList<>();
//        strings.add("First");
////  Ex. 0:
//        ArrayList<Integer> numbers = new ArrayList<>(10);
//        Random random = new Random();
//        int theLargest = 0;
//        int theLowest = 51;
//        int sum = 0;
//        double evenNumbersAverage = 0;
//        int count = 0;
//        for (int i = 0; i < 10; i++) {
//            numbers.add(random.nextInt(1, 51));
//        }
//        for (Integer integer : numbers) {
//            sum += integer;
//            if (theLargest < integer) {
//                theLargest = integer;
//            }
//            if (theLowest > integer) {
//                theLowest = integer;
//            }
//            if (integer % 2 == 0) {
//                evenNumbersAverage += integer;
//                count++;
//            }
//        }
//        System.out.println("Largest: " + theLargest + ", Lowest: " + theLowest + ", Sum: " + sum + ", Even numbers average: " + evenNumbersAverage/count +
//                "\nThe array List is: " + numbers);
//     Ex.0.5:
//        Random random = new Random();
//        ArrayList<Geolocation> geolocations1 = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            geolocations1.add(i, new Geolocation(random.nextDouble(1, 51), random.nextDouble(1,51)));
//            while (geolocations1.get(i).getLongitude() > 10){
//                geolocations1.get(i).setLongitude(random.nextDouble(1 , 11));
//            }
//        }
//        System.out.println(geolocations1);
////  Ex.1
//        ArrayList<String> inputUser = new ArrayList<>(5);
//        Scanner scanner = new Scanner(System.in);
//        String theLongestString = "";
//        int temp = 0;
//        int doublesLongestStrings = 0;
//        for (int i = 0; i < 5; i++) {
////            inputUser.add(i, scanner.next());
//        }
//        for (String string : inputUser){
//            if (theLongestString.length() < string.length()){
//                theLongestString = string;
//            }
//        }
//        for (int i = 0; i < 5; i++) {
//            if (inputUser.get(i).contains(theLongestString)){
//                temp++;
//            }
//        }
//        System.out.println("the longest string is: " + theLongestString + ", times " + temp);
//    Ex.2,A
//        HashSet<Integer> hashSet1 = new HashSet<>();
//        HashSet<Integer> hashSet2 = new HashSet<>();
//        hashSet1.add(1);
//        hashSet1.add(2);
//        hashSet1.add(3);
//        hashSet1.add(4);
//        hashSet2.add(1);
//        hashSet2.add(2);
//        hashSet2.add(5);
//        hashSet2.add(6);
//        for (Integer integer1 : hashSet1){
//            for (Integer integer2 : hashSet2){
//                if (Objects.equals(integer1, integer2)){
//                    System.out.println(integer1);
//                }
//            }
//        }
//  Ex.2,B
//        HashSet<Integer> hashSet = new HashSet<>();
//        int count = 0;
//        Random random = new Random();
//        while (hashSet.size() < 50) {
//            hashSet.add(random.nextInt(1, 51));
//            count++;
//        }
//        System.out.println(hashSet);
//        System.out.println(count);
////  Ex. HashMap:
//        HashMap<String, String> names = new HashMap<>();
//        names.put("A1234", "Steve Jobs");
//        names.put("A1235", "Scott McNealy");
//        names.put("A1236", "Jeff Bezos");
//        names.put("A1237", "Bill Gates");
//        names.put("A1237", "Haim nemirovski");
//        names.put("A1234", "yohad vahaba");
////        for (String ref: names.values()){
////            System.out.println(ref);
////        }
//  Ex. more collections exercises:
//        ArrayList<Circle> circles = new ArrayList<>();
//        String[] colors = new String[5];
//        colors[0] = "red";
//        colors[1] = "blue";
//        colors[2] = "purple";
//        colors[3] = "yellow";
//        colors[4] = "wight";
//        Random random = new Random();
//        double rand = 0;
//        while (rand < 90) {
//            circles.add(new Circle(rand = random.nextDouble(10, 101), colors[random.nextInt(0, 5)]));
//        }
//        for (Circle ref: circles){
////            System.out.println(ref.toString() + " The area is: " + ref.getRadius() * ref.getRadius() * Math.PI);
//        }
//  Ex. more collections exercises:
//  Ex 6:   Input a string from the user and print the number of occurrences of each letter in the string (how many times each letter is in the string). For example if the string is “Hello World” the program will output: [ H=1, e=1, l=3, o=2, W=1, r=1, d=1 ]
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        HashMap<Character, Integer> inputUser = new HashMap<>();
//        for (int i = 0; i < input.length(); i++) {
//            if (input.charAt(i) != ' ') {
//                if (i == 0 || inputUser.get(input.charAt(i)) == null ) {
//                    inputUser.put(input.charAt(i), 1);
//                }else {
//                    inputUser.put(input.charAt(i), inputUser.get(input.charAt(i)) + 1);
//                }
//            }
//        }
//        System.out.println(inputUser);

    }
}
