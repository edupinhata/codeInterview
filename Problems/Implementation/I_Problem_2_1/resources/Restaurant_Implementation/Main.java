import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

class Main {
    public static void main(String[] args) {
        File f = new File("inputs/Order1");
        OrderItem[] orderItems;

        try{
            Scanner s = new Scanner(f);
            int numDishes  = Integer.parseInt(s.nextLine());
            int numPeople = Integer.parseInt(s.nextLine());
            double total = 0;

            orderItems = new OrderItem[numDishes];

            for (int i=0; i<numDishes; i++) {
                String[] dishesInfo = s.nextLine().split(" ");
                OrderItem oi = new OrderItem(dishesInfo[0], Double.parseDouble(dishesInfo[1]));
                orderItems[i] = oi;
            }

            for (int i=0; i<numDishes; i++){
                total += orderItems[i].getPrice();
                System.out.println(orderItems[i]);
            }
            System.out.println("===========================");
            System.out.printf("Total: R$%.2f\n", total);
            System.out.println("Num. of people: " + numPeople);
            System.out.printf("Total per person: $%.2f\n", total/numPeople);

            s.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}