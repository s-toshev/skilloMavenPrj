package Lession02;

import java.util.Scanner;

public class task3_5 {
    public task3_5() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());
        double area = width * height / 2.0;
        System.out.printf("Triangle area is %.0f", area);
    }
}