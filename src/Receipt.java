import java.util.Scanner;

@SuppressWarnings("resource")

public class Receipt {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Cost of food items: $");
        double food = in.nextDouble();

        System.out.print("Cost of nonfood items: $");
        double nonFood = in.nextDouble();
        System.out.printf("\n\n");

        double subtotal = food + nonFood;
        double taxFood = food * 0.01;
        double taxNonFood = nonFood * 0.0875;
        double Total = subtotal + taxFood + taxNonFood;
        String costFood = "Cost of food items";
        String costNonFood = "Cost of nonfood items";
        String itemSubtotal = "Item SUBTOTAL";
        String tax = "Tax on food items";
        String nontax = "Tax on nonfood items";
        String grandTotal = "TOTAL";

        String b = "RECEIPT";
        System.out.printf("%-5s\n",b);

        System.out.printf("%-10s %10.2f\n",costFood,food);
        System.out.printf("%-10s %7.2f\n",costNonFood,nonFood);
        System.out.printf("%-10s %15.2f\n\n",itemSubtotal, subtotal);
        System.out.printf("%-10s %11.2f\n",tax,taxFood);
        System.out.printf("%-10s %8.2f\n\n",nontax,taxNonFood);
        System.out.printf("%-5s %23.2f\n",grandTotal,Total);

      
        
        
    }

}
