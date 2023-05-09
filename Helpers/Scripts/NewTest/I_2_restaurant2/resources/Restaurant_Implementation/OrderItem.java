

public class OrderItem {

    public OrderItem(){}

    public OrderItem(String dishName, double price) {
        this.dishName = dishName;
        this.price = price;
    }

    private String dishName;
    private int amount;
    private double price;

    //region SETTERS/GETTERS
    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    //endregion

    public String toString()
    {
        return this.dishName + " | " + this.price;
    }
}