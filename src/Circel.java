//Program to find the area and circumference of the circle by accepting the radius from the user
import java.util.Scanner;
import java.lang.Math;
public class Circel {
    public static void main(String args[]){
        double circum, r, area;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the radius of the circle:");
        r= sc.nextDouble();
        circum = Math.PI * 2 * r;
        area = Math.PI * r * r;
        System.out.println("Area of circle is :"+ area);
        System.out.println("The circumference of circle is :" + circum);
        sc.close();
    }
    
}
