public class OrderItem {

    private String dishName;
    private int amount;
    private double price;

    public OrderItem(){}

    public OrderItem(String dishName, double price) {
        this.dishName = dishName;
        this.price = price;
        this.amount = 1;
    }

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

    public double getTotalPrice()
    {
        return price*amount;
    }

    public String toString()
    {
        return String.format("%-10s | %2dx | %.2f", this.dishName, this.amount, getTotalPrice());
    }
}