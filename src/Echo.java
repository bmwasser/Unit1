import java.util.Scanner;

@SuppressWarnings("resource")
public class Echo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Type some characters:");
        String line = in.nextLine();  
        System.out.println("You typed: " + line);

         System.out.print("Type a whole number: ");
        int wholeNum = in.nextInt();   
        System.out.println("You typed: " + wholeNum);

        System.out.print("Type a decimal number: ");
        double decNum = in.nextDouble();
        System.out.println("You typed: " + decNum);   
    }

}
