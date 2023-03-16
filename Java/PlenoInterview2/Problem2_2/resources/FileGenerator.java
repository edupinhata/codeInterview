import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

class FileGenerator {
    public static void main(String[] args) {
        int filesToCreate = 60;
        int currentFile = 1;
        int numMaxDishes = 10;
        int numMaxPeople = 8;

        OrderCreator oc = new OrderCreator(numMaxDishes, numMaxPeople);

        for(int i=0; i<filesToCreate; i++) {
            oc.createFile(String.format("orders/Order%d.txt", currentFile));
            currentFile++;
        }
    }
}


class OrderCreator {
    private int numMaxDishes;
    private int numMaxPeople;
    private int numExistingDishes=12;
    private String[] existingDishesNames = {"Dish1", "Dish2", "Dish3", "Dish4",
                                    "Dish5", "Dish6", "Dish7", "Dish8",
                                    "Dish9", "Dish10", "Dish11", "Dish12"};

    public OrderCreator(int numMaxDishes, int numMaxPeople){
        this.numMaxPeople = numMaxPeople;
        this.numMaxDishes = numMaxDishes;
    }

    public void createFile(String fileName){
        Random random = new Random();
        int numDishes = random.nextInt(numMaxDishes)+1;
        int numPeople = random.nextInt(numMaxPeople)+1;
        int randomIndex;

         try{
            FileWriter myWriter = new FileWriter(fileName);
            myWriter.write(numDishes + "\n");
             myWriter.write(numPeople + "\n");
            for (int i=0; i<numDishes; i++){
                randomIndex = random.nextInt(numExistingDishes);
                myWriter.write(existingDishesNames[randomIndex] + "\n");
            }
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch(
        IOException e)

        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

}
