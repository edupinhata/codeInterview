import java.util.List;
import java.util.ArrayList;

class Order{
    //VARIABLES
    private List<OrderItem> orderItems;
    private int NumPeople;

    // CONSTRUCTOR
    public Order(int numPeople){
        this.orderItems = new ArrayList<OrderItem>();
        this.NumPeople = numPeople;
    }

    //region GETTER/SETTER
    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrderItem> orderItems) {
        this.orderItems = orderItems;
    }

    public int getNumPeople() {
        return NumPeople;
    }

    public void setNumPeople(int numPeople) {
        this.NumPeople = numPeople;
    }
    //endregion

    public double getOrderTotal(){
        double total = 0;
        for (OrderItem oi : orderItems){
        total += oi.getTotalPrice();
        }
        return total;
    }

    public double getTotalPerPerson(){
        return getOrderTotal()/this.NumPeople;
    }

    public OrderItem getOrderItemByName(String dishName){
        for (OrderItem oi : this.orderItems){
            if (oi.getDishName().equals(dishName)) {
                return oi;
            }
        }
        return null;
    }

    public void addNewOrderItem(OrderItem oi){
        orderItems.add(oi);
    }

    public void addExistingOrderItem(OrderItem oiToAdd){
        OrderItem oi = getOrderItemByName(oiToAdd.getDishName());
        oi.setAmount(oi.getAmount()+1);
    }

    public void printOrder(){
        orderItems.sort((o1, o2) -> Double.compare(o2.getTotalPrice(), o1.getTotalPrice()));
        for (OrderItem oi : this.orderItems){
            System.out.println(oi);
        }
        System.out.println("=========================");
        System.out.printf("Total: $%.2f\n", getOrderTotal());
        System.out.printf("Num of people: %d\n", NumPeople);
        System.out.printf("Total per person: $%.2f\n", getTotalPerPerson());
    }
}