package creational.builder2;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<String> toppings = new ArrayList<>();
        toppings.add("Shrooms");
        toppings.add("Pineapple");
        toppings.add("Pepperoni");
        Pizza pizza = new Pizza(8, PizzaSize.ExtraLarge, "regular", toppings);

        System.out.println(pizza);


        Pizza pizza2 = new Pizza.Builder()
                .setDoughType("thin")
                .setNumOfSlices(4)
                .setPizzaSize(PizzaSize.ExtraLarge)
                .addTopping("Jalapeno")
                .addTopping("Peperoni")
                .setNumOfSlices(12)
                .build();

        System.out.println(pizza2);


    }
}
