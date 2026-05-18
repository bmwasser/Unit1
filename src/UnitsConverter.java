import java.util.Scanner;

@SuppressWarnings("resource")

public class UnitsConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Type a whole number in degress Fahrenheit: ");
        int degF = in.nextInt(); 
        int degC = (degF - 32) * 5 / 9;
        System.out.println(degF + " degrees Fahrenheit equals " + degC + " degrees Celcius ");

        System.out.print("Type your height (feet): ");
        double height = in.nextDouble();
        System.out.print("Type your height (inches): ");
        double inch = in.nextDouble();
        double popT = ((height * 12) + inch) / 6.5;
        System.out.println(height + "ft" + inch + "inch" + " is your height is " + popT + " poptars stacked up and down ");
        
        
    }

}

