// package SIR.java;
import java.util.Scanner;
public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int b = a%100;
        int c = b%10;
        int d = a/100;

        System.out.print(c+d);
        sc.close();
    }
}
