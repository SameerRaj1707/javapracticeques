// package SIR.java;
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int months,year,week,day;
        System.out.println("Enter day number ");
        months = sc.nextInt();

        year = months/365;
        months = months%365;
        System.out.println("No. of years "+year);

        week = months/7;
        months = months%7;
        System.out.println("No. of weeks "+week);

        day = months;
        System.out.println("No. of days "+day);
        sc.close();
    }
}
