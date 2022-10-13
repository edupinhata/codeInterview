import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class Main {
    public static void main(String[] args) {
        File f = new File("inputs/Order1");
        Order order;

        try{
            Scanner s = new Scanner(f);
            int numDishes  = Integer.parseInt(s.nextLine());
            int numPeople = Integer.parseInt(s.nextLine());
            order = new Order(numPeople);

            for (int i=0; i<numDishes; i++) {
                String[] dishesInfo = s.nextLine().split(" ");
                // Tenta adicionar o OrderItem
                OrderItem oiToAdd = new OrderItem(dishesInfo[0], Double.parseDouble(dishesInfo[1]));
                OrderItem oi = order.getOrderItemByName(oiToAdd.getDishName());
                if (oi == null)
                    order.addNewOrderItem(oiToAdd);
                else
                    order.addExistingOrderItem(oi);
            }

            order.printOrder();

            s.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}