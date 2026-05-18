public class Time {
    public static void main(String[] args) {
        int hour = 21;
        int minute = 7;
        int second = 45;
        System.out.print("Number of seconds since midnight: ");
        System.out.println(hour * 60 * 60 + minute * 60 + second );
        System.out.print("Number of seconds remaining in the day: ");
        System.out.println((24 - hour) * 60 * 60 + (60 - minute) * 60 + 60 - second);
        System.out.print("Percentage of day that has passed: ");
        System.out.println((hour * 60 * 60 + minute * 60 + second) * 100 /86400);
    }

}
