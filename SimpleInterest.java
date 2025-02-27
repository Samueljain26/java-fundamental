import java.util.*;
 class SimpleInterest{
 public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
                double p =sc.nextDouble();
	System.out.print("Enter the rate of interest: ");
                double r =sc.nextDouble();
	System.out.print("Enter the Time period: ");
                double t =sc.nextDouble();

        double interest = (p*r*t)/100;
                System.out.println("Simple Interest " + interest);
}
}
