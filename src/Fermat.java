public class Fermat {
    public static void main (String[] args) {
        System.out.println(fermatTheorem(2,1,3,3));
        System.out.println (triangleLengths(3,3,4));
    }

    public static String fermatTheorem (int a, int b, int c, int n){
    
    if ((n > 2) && (Math.pow(a,n) + Math.pow(b,n) == Math.pow(c,n))){
        return "Holy smokes, Fermat was wrong!";
    } else {
        return "No, that doesn't work.";
    }
        
  }
    public static String triangleLengths (int a, int b, int c){
    
    if (a<= 0 || b <= 0 || c <= 0){
        return "Error";
    }

    if (a > b + c || b > a + c || c > a + b){
        return "No triangle can be made";
    } else {
        return "Triangle can be made";
    } 
    

    }
        
}
    