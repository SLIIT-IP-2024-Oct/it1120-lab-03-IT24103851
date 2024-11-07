import java.util.Scanner;

public class IT24103851Lab3Q1A {
    public static void main(String[] args) {
             
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter the price of 1 kg of rice: ");
        double pricePerKg = scanner.nextDouble();
        
        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();
        
        double totalCost = pricePerKg * quantity;
        
        System.out.println("The total amount to pay is: " + totalCost);
        

        scanner.close();
    }
}
