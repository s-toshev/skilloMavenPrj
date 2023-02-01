package Lession02;

import java.util.Scanner;

public class task6 {
    public task6() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = Double.parseDouble(scanner.nextLine());
        double b = Double.parseDouble(scanner.nextLine());
        double c = Double.parseDouble(scanner.nextLine());
        double sqrt = Math.sqrt(b * b - 4.0 * a * c);
        double positiveAnswer = (-b + sqrt) / (2.0 * a);
        System.out.printf("X= %.2f%n", positiveAnswer);
        double negativeAnswer = (-b - sqrt) / (2.0 * a);
        System.out.printf("X= %.2f", negativeAnswer);
    }
}
