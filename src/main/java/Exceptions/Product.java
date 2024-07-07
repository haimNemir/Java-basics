package Exceptions;

public class Product {
    private String productId, name;
    private int stock;

    public Product(String productId, String name, int stock) throws InvalidOperationException{
        this.productId = productId;
        this.name = name;
        if (stock > 0)
            this.stock = stock;
        else throw new InvalidOperationException("Please enter greater number than zero");
    }


    public void reduceStock(int quantity) throws InvalidOperationException{
        if (stock >= quantity)
            stock -= quantity;
        else throw new InvalidOperationException("You must have more items in your stock than: " + quantity + ". Current: " + stock);
    }

    public void increaseStock(int quantity) throws InvalidOperationException{
        if (quantity > 0)
            stock += quantity;
        else throw new InvalidOperationException("You must give a bigger number of items than 0 to increase the stock!!");
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", stock=" + stock +
                '}';
    }
}
