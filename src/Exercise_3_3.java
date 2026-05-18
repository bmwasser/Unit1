import java.util.Scanner;

@SuppressWarnings("resource")

public class Exercise_3_3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a certain amount of seconds: ");
        int totalSeconds = in.nextInt(); 
        int hours = totalSeconds / 3600;
        int remainderHour = totalSeconds % 3600;
        int minutes = remainderHour / 60; 
        int remainderMinute = minutes % 60;
        int seconds = remainderHour - (remainderMinute * 60);
        System.out.printf("%d seconds = %d hours, %d mintues, and %d seconds\n",totalSeconds,hours,minutes,seconds);
        
        
    }

}

