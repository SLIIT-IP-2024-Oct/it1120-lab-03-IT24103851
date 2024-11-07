import java.util.Scanner;

public class IT24103851Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount in rupees: ");
        int amount = scanner.nextInt();

        int[] denominations = {5000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] count = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            if (amount >= denominations[i]) {
                count[i] = amount / denominations[i];
                amount = amount % denominations[i];
            }
        }

        System.out.println("Denominations breakdown:");
        for (int i = 0; i < denominations.length; i++) {
            System.out.println(denominations[i] + " Notes/Coins – " + count[i]);
        }
        scanner.close();
    }
}
