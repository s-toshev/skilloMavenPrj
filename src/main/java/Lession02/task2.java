package Lession02;

import java.util.Scanner;

public class task2 {  public task2() {
}

    public static void main(String[] args) {
        new Scanner(System.in);
        double a = 1.5;
        double b = 3.5;
        double c = 2.2;
        double perimeter = a + b + c;
        System.out.printf("The perimeter of the abc triangle is: %.2f", perimeter);
    }
}
