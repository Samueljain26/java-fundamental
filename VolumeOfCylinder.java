import java.util.*;
 class VolumeOfCylinder{
 public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the radius of cylinder: ");
                double r =sc.nextDouble();
System.out.print("Enter the height of cylinder: ");
                double h =sc.nextDouble();

        double volume = Math.PI*Math.pow(r,2)*h;
                System.out.println("Volume of Cylinder: " + volume);
}
}

