import java.util.Scanner;

public class IT24103851Lab3Q1B {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        
            System.out.print("Enter the price of 1 kg of rice: ");
            double pricePerKg = scanner.nextDouble();
                
            System.out.print("Enter the number of kilograms you want to buy: ");
            double quantity = scanner.nextDouble();
        
            double totalamount = pricePerKg * quantity;
        
            double discount = totalamount * 0.10;
        
            double finalAmount = totalamount - discount;
         
          System.out.println("Discount applied: " + discount);
          System.out.println("Amount to pay after discount: " + finalAmount);
        
        
       scanner.close();
    }
}
