import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Variable identification
        int distance;
        double perKm = 2.20, price, totalPrice;

        // Retrieving data from the user
        System.out.print("Please enter the distance (in km) :");
        distance = input.nextInt();

        // Calculation Section
        price = 10 + distance * perKm;
        totalPrice = (price <= 20) ? 20 : price;

        System.out.println("Total Amount : " + totalPrice + " TL");
    }
}