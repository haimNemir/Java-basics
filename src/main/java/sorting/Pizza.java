package sorting;

public class Pizza implements Comparable<Pizza>{
    private int slice;
    private double price;

    public Pizza(int slice, double price) {
        this.slice = slice;
        this.price = price;
    }

    public int getSlice() {
        return slice;
    }

    public void setSlice(int slice) {
        this.slice = slice;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return
                "Pizza - slice: " + slice +
                ", price:" + price + "."
                ;
    }

    @Override
    public int compareTo(Pizza p) {
        if (this.getPrice() == p.getPrice()){
            return p.getSlice() - this.getSlice();
        } else if (this.getPrice() < p.getPrice()) {
            return 1;
        }
        else return -1;
    }
}
