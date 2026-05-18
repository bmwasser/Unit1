import java.util.Scanner;

@SuppressWarnings("resource")

public class Exercise_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        double degC = in.nextDouble(); 
        double degF = (degC * 9/5) + 32;
        System.out.printf("%.1f C = %.1f F\n",degC,degF);
        
        
    }

}

