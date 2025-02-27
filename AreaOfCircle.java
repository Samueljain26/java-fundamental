import java.util.*;
 class AreaOfCircle{
 public static void main(String[] args){
	Scanner sc =new Scanner(System.in);
 	System.out.print("Enter the radius of circle: ");
		double r =sc.nextDouble();
	double area = Math.PI*Math.pow(r,2);
		System.out.println("Area of circle: " + area);
}
}
