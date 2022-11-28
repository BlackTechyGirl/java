import org.junit.jupiter.api.Test;
import tdd.CheckOut;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class CheckOutTest {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            CheckOut checkout = new CheckOut("bread", 2, 500, 1000);

            List<CheckOut> products = new ArrayList<>();

            String nextProduct;
            double total;
            double subTotal = 0;
            double vat;
            double discountAmount;
            double billTotal;
            double balance;

            System.out.println("What is the customer's name?");
            String customerName = input.nextLine();
            checkout.setCustomerName(customerName);

            do {
                try {
                    System.out.println("What did the user buy?");
                    String productName = input.nextLine();
                    checkout.setProduct(productName);

                    System.out.println("How many pieces?");
                    int quantity = input.nextInt();
                    checkout.setQuantity(quantity);

                    System.out.println("How much per unit?");
                    double price = input.nextDouble();
                    checkout.setPrice(price);

                    total = checkout.getPrice() * checkout.getQuantity();
                    subTotal = subTotal + total;

                    products.add(new CheckOut(productName, quantity, price, total));

                }
                catch (InputMismatchException f) {
                    System.out.println("Wrong input");
                }
                System.out.println();
                System.out.println("Want to add more product (Yes/No)?");
                input.nextLine();
                nextProduct = input.next();
                input.nextLine();
            }

            while ((nextProduct.equals("Yes")) || (nextProduct.equals("yes")));

            if (nextProduct.equals("No") || nextProduct.equals("no") || nextProduct.equals("NO")){
                System.out.println();
            }

            try {System.out.println("What is your name?");
                String cashierName = input.nextLine();
                checkout.setCashierName(cashierName);

                System.out.println("How much discount will he/she gets?");
                double discount = input.nextDouble();
                checkout.setDiscount(discount);
            }
            catch (InputMismatchException f){
                System.out.println("Wrong input");
            }

            discountAmount = (checkout.getDiscount()/100) * subTotal;
            vat = subTotal * (17.50/100);
            billTotal = subTotal + vat - discountAmount;
            if (billTotal == 0){
                System.out.println("Buy an item!");
            }
            else {
                System.out.println("\n===========================================================================");
                for (CheckOut a : products) {
                    a.displayList();
                }
                System.out.println("---------------------------------------------------------------------------");
                System.out.printf("%36s%16f%n", "Sub Total:", subTotal);

                System.out.printf("%36s%16f%n", "Discount:", discountAmount);

                System.out.printf("%36s%16f%n", "VAT @ 17.50%:", checkout);
                System.out.println("===========================================================================");

                System.out.printf("%36s%16f%n", "Bill Total:", billTotal);
                System.out.println("===========================================================================");
                System.out.println("\t\t\tTHIS IS NOT A RECEIPT, KINDLY PAY " + billTotal);
                System.out.println("===========================================================================");

                System.out.println("How much did the customer give you?");
                double amountPaid = input.nextDouble();
                checkout.setAmountPaid(amountPaid);

                System.out.println("\nJERRY STORES");
                System.out.println("MAIN BRANCH");
                System.out.println("LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS");
                System.out.println("TEL: 0810158612");
                System.out.println("Cashier: " + checkout.getCashierName());
                System.out.println("Customer Name: " + checkout.getCustomerName());
                System.out.println("===========================================================================");
                System.out.printf("%24s%16s%16s%16s%n", "ITEM", "QTY", "PRICE", "TOTAL");
                System.out.println("---------------------------------------------------------------------------");
                for (CheckOut a : products) {
                    a.displayList();
                }
                System.out.println("---------------------------------------------------------------------------");
                System.out.printf("%36s%16f%n", "Sub Total:", subTotal);
                System.out.printf("%36s%16f%n", "Discount:", discountAmount);
                System.out.printf("%36s%16f%n", "VAT @ 17.50%:", checkout);
                System.out.println("===========================================================================");
                System.out.printf("%36s%16f%n", "Bill Total:", billTotal);
                System.out.printf("%36s%16f%n", "Amount Paid:", checkout.getAmountPaid());
                balance = checkout.getAmountPaid() - billTotal;
                System.out.printf("%36s%16f%n", "Balance:", balance);
                System.out.println("===========================================================================");
                System.out.println("\t\t\t\tTHANK YOU FOR YOUR PATRONAGE");
                System.out.println("===========================================================================");

            }
        }
}
