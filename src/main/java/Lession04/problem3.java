package Lession04;

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Unit Price:");
        int unitPrice = scanner.nextInt();
        System.out.println("Enter quantity:");
        int qty = scanner.nextInt();

        double discountPercentage = 0;
        if(qty>=100&&qty<=120){
            discountPercentage=0.15;
        }else if(qty>120){
            discountPercentage=0.20;
        }else{
            discountPercentage=0.0;
        }

        double revenueFromSale =unitPrice*qty;
        double discount = revenueFromSale*discountPercentage;
        double revenueWithDiscount = revenueFromSale-discount;

        System.out.printf("The revenue from sale with discount" +
                " is %.2f$%n",revenueWithDiscount);
        System.out.printf("The discount is: %.2f$",discount);
    }
}
