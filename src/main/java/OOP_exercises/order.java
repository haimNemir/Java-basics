package OOP_exercises;

//צרו קלאס חדש בשם Order המכיל:
//· String productName
//· double price
//· int quantity
//הוסיפו constructor המקבל את כל הפרמטרים
//הוסיפו מתודה לחישוב והדפסת סה"כ עלות הזמנה
//הוסיפו מתודה להדפסת כל מידע ההזמנה
//צרו קלאס חדש ובו main ובו צרו 2 אובייקטים של הזמנה שונים, הדפיסו את המידע של כל אובייקט בעזרת המתודות

public class order {
    String productName;
    double thePrice;
    int quantity;

    public static void main(String[] args) {
        order order1 = new order("pen", 10.90, 3);
        order order2 = new order("paper", 1.99, 10);
        orderDetails(order1.productName, order1.thePrice, order1.quantity);
        sumPrice(order1.quantity, order1.thePrice);
    }
    public order(String productName, double thePrice, int quantity){
        this.productName = productName;
        this.thePrice = thePrice;
        this.quantity = quantity;
    }
    public static void orderDetails(String productName, double thePrice, int quantity){
        System.out.println("Product: " + productName + "\n" + "Quantity: " + quantity  + "\n" + "The price for item is: " + thePrice);
    }
    public static void sumPrice(int quantity, double thePrice){
        System.out.println("The cost of the order is: " + quantity*thePrice);
    }
}

