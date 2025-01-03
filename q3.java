// package SIR.java;
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pi = Math.PI;
        float r = sc.nextFloat();

        System.out.println("Area "+pi*r*r);
        System.out.println("Circumference "+2*pi*r);
        sc.close();
    }
}
