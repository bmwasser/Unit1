public class Exercise4_1 {


  public static void main(String[] args) {
    printAmerica();
    printEurope();
     
    }
  public static void printAmerica(){
    String American = "American format: ";
    String month = "September";
    String weekday = "Monday";
    int day = 8;
    int year = 2025;
    System.out.println(American + weekday + ", " + month + " " + day + ", " + year);

    }
  public static void printEurope(){
    String European = "European format: ";
    String month = "September";
    String weekday = "Monday";
    int day = 8;
    int year = 2025;
    System.out.println(European + weekday + " " + day + " " + month + " " + year);

    }
}


