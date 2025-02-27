import java.util.*;

class TemperatureConversion{
	 public static void main(String[] args){ 
		Scanner sc = new Scanner(System.in); 
	System.out.print("temperature in celsius: ");
		int c =sc.nextInt();
		 int f = ((c*(9/5))+32);
  	System.out.print("Fahrenheit ="+ f);
}
}
