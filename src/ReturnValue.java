public class ReturnValue {
    
    public static void main(String[] args) {
    double volume = calcCylinderVolume(2,3);
    System.out.println(volume);
    
    String clock = calcTime(5000);
    System.out.println(clock);

    String roots = calcRoots(1, -5, 6);
    System.out.println(roots);
     
    }
    
    
    public static double calcCylinderVolume(double height, double diameter){
        double radius = Math.pow(diameter / 2,2);
        return radius * height * Math.PI;
        
    }

     public static String calcTime(int seconds){
        int hours = seconds / 3600;
        int remainderHour = seconds % 3600;
        int minutes = remainderHour / 60; 
        int remainderMinute = minutes % 60;
        int leftoverseconds = remainderHour - (remainderMinute * 60);
        String clock = String.format("%02d:%02d:%02d", hours, minutes, leftoverseconds);
        return clock;
     }

    public static String calcRoots(double a, double b, double c){
        double discriminant = Math.pow(b,2) - 4 * a * c;
        double sqrtDiscriminant = Math.sqrt(discriminant);
        double plusSolution = (-b + sqrtDiscriminant) / (2 * a);
        double minusSolution = (-b - sqrtDiscriminant) / (2 * a);
        String roots = "Root 1: " + plusSolution + " " + "Root 2: " + minusSolution;
        return roots;
    }

}

//quadratice formula = -b +/- squareroot(b^2 - 4ac) divided by 2a