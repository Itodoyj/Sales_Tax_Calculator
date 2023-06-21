//Tax Calculator

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        double tax_Rate = 0.05; // 5% tax rate

        double purchase_Amount = 500;

        double tax_paid= purchase_Amount * tax_Rate;
        double total_Amount = purchase_Amount + tax_paid;

        System.out.println("Purchase Amount: $" + purchase_Amount);
        System.out.println("Tax: $" + tax_paid);
        System.out.println("Total amount: $" + total_Amount);

    }
}
