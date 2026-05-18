public class FormatExamples {
    
    public static void main(String[] args) {
        String str = "Hello";
        int x = 3;
        double pi = 3.14159;

        //Right-justified string in 10 spaces
        //Make sure number of spaces is always longer than the string
        System.out.printf("->%10s<-\n",str);

        //Left-justified string in 10 spaces
        System.out.printf("->%-10s<-\n",str);

        //Left-justified integer in 10 spaces
        System.out.printf("->%-10d<-\n",x);

        //Right-justified integer in 10 spaces
        System.out.printf("->%10d<-\n",x);

        //Right-justified integer in 5 spaces with leading zeros
        System.out.printf("->%05d<-\n",x);

        //Right-justfied double in 10 spaces with two decimal places
        System.out.printf("->%10.2f<-\n",pi);

        //Right-justfied double in 10 spaces with four decimal places
        System.out.printf("->%10.4f<-\n",pi);


    }
}
