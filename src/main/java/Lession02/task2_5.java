package Lession02;

import java.util.Scanner;

public class task2_5 {
    public task2_5() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double perimeter = a + b + c;
        System.out.printf("The perimeter of the abc triangle is: %.2f", perimeter);
    }
}
