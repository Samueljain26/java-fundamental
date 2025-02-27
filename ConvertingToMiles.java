import java.util.*;

class ConvertingToMiles{
         public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Distance in Kilometers: ");
                double k =sc.nextDouble();
                 double m = k*0.621371;
        System.out.print("Distance in Miles ="+ m);
}
}
