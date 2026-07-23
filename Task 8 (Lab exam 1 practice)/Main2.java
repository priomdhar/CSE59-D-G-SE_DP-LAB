import java.util.Scanner;
class ShoppingCart {
    String[] itemNames = new String[100];
    double[] prices = new double[100];
    int[] quantities = new int[100];
    int count = 0;

    void addItem(String itemName, double price, int qty)
    {
        itemNames[count] = itemName;
        prices[count] = price;
        quantities[count] = qty ;
        count ++;
    }

    double getSubtotal() {
        double subtotal = 0;

        for (int i = 0; i< count ; i++)
        {
            subtotal += prices[i] * quantities[i];

        }

        return subtotal;
    }

    double applyDiscount(double percentage)
    {
        double subtotal = getSubtotal();
        return subtotal - (subtotal * percentage / 100);
    }

    double calculateTotalWithTax(double taxRate , double discountPercentage)
    {
        double total = applyDiscount(discountPercentage);
        total = total + (total * taxRate /100);
        return total;
    }
}

public class task2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        ShoppingCart cart = new ShoppingCart();

        while (true)
        {
            String item = input.next();

            if(item.equalsIgnoreCase("Discount"))
            {
                break;
            }

            double price = input.nextDouble();

            int qty = input.nextInt();

            cart.addItem(item, price , qty);

        }

        double discount = input.nextDouble();

        input.next();
        double tax = input.nextDouble();

        System.out.println("Subtotal : " + (int) cart.getSubtotal());
        System.out.println("Total after " + (int) discount + "% discount and " +(int) tax + "% tax : " + cart.calculateTotalWithTax(tax, discount));

        input.close();
    }
}

