import java.util.*;

class PowerCalculation{
         public static void main(String[] args){
                Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Base: ");
                double b =sc.nextDouble();
 System.out.print("Enter the Power: ");
                double p =sc.nextDouble();
                 double result = Math.pow(b,p);
        System.out.print("result ="+ result);
}
}
