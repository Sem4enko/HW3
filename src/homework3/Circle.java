package homework3;
import java.util.Scanner;
//Task1
public class Circle {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("Radius:");
        double radius = a.nextDouble();
        double s = Math.PI * (radius * radius);
        System.out.println("Square: " + s);
    }
}