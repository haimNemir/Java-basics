package creational.builder2;

import java.util.ArrayList;

public class Pizza {
    private int numOfSlices;
    private PizzaSize size;
    private String doughType;
    private ArrayList<String> toppings = new ArrayList<>();

    public Pizza(int numOfSlices, PizzaSize size, String doughType, ArrayList<String> toppings) {
        this.numOfSlices = numOfSlices;
        this.size = size;
        this.doughType = doughType;
        this.toppings = toppings;
    }

    public int getNumOfSlices() {
        return numOfSlices;
    }

    public void setNumOfSlices(int numOfSlices) {
        this.numOfSlices = numOfSlices;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public String getDoughType() {
        return doughType;
    }

    public void setDoughType(String doughType) {
        this.doughType = doughType;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "numOfSlices=" + numOfSlices +
                ", size=" + size +
                ", doughType='" + doughType + '\'' +
                ", toppings=" + toppings +
                '}';
    }

    public static class Builder{
        private int numOfSlices;
        private PizzaSize size;
        private String doughType;
        private ArrayList<String> toppings = new ArrayList<>();

        public Builder setNumOfSlices(int numOfSlices){
            this.numOfSlices = numOfSlices;
            return this;
        }

        public Builder setPizzaSize(PizzaSize pizzaSize){
            this.size = pizzaSize;
            return this;
        }

        public Builder setDoughType(String doughType){
            this.doughType = doughType;
            return this;
        }
        public Builder addTopping(String topping){
            this.toppings.add(topping);
            return this;
        }

        public Pizza build(){
            return new Pizza(numOfSlices, size, doughType, toppings);
        }
    }
}
