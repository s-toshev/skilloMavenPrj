package Lession04;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of the day: ");
        int dayNum = scanner.nextInt();

        switch (dayNum){
            case 1:
                System.out.printf("The %d-st day of the week " +
                        "is Monday",dayNum);
                break;
            case 2:
                System.out.printf("The %d-nd day of the week " +
                        "is Tuesday",dayNum);
                break;
            case 3:
                System.out.printf("The %d-rd day of the week " +
                        "is Wednesday",dayNum);
                break;
            case 4:
                System.out.printf("The %d-th day of the week " +
                        "is Thursday",dayNum);
                break;
            case 5:
                System.out.printf("The %d-th day of the week " +
                        "is Friday",dayNum);
                break;
            case 6:
                System.out.printf("The %d-th day of the week " +
                        "is Saturday",dayNum);
                break;
            case 7:
                System.out.printf("The %d-th day of the week " +
                        "is Sunday",dayNum);
                break;
            default:
                System.out.println("Error!");
        }
    }

}
