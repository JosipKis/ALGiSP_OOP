package pckg_banka;

import java.util.Random;

public class Customer {

    private String name;
    private int id;
    private static int cntID = 40;
    private static final String[] FIRST_NAMES = {"Alice", "Bob", "Charlie", "David", "Eve", "Frank", "Grace", "Hank", "Ivy", "Jack", "Kate", "Luke", "Mary", "Nancy", "Oscar", "Peter", "Quincy", "Rose", "Sam", "Tom", "Ursula", "Victor", "Wendy", "Xander", "Yolanda", "Zack"};
    private static final String[] LAST_NAMES = {"Adams", "Brown", "Clark", "Davis", "Evans", "Ford", "Green", "Harris", "Irwin", "Jones", "King", "Lee", "Miller", "Nelson", "Oliver", "Parker", "Quinn", "Robinson", "Smith", "Taylor", "Underwood", "Vance", "Williams", "Xavier", "Young", "Zimmerman"};
    private static final Random random = new Random();


    public Customer(String name){
        this.id = cntID++;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public static String generateName() {
        String firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
        String lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
        return firstName + " " + lastName;
    }
}
