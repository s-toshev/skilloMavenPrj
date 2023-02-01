package Lession04;

import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        if(age>=16){
            System.out.println("You are eligible to work.");
        }else{
            System.out.println("You are not eligible to work.");
        }

    }
}
