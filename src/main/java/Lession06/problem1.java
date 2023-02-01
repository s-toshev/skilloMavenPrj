package Lession06;

import java.util.Scanner;

public class problem1 {
    public static void main(String[] args) {

        System.out.println(findSmallestNum(5.5,13.1,12.2));
    }
    public static double findSmallestNum (double num1, double num2, double num3){

        double smallestNum = num1;
        if(smallestNum> num2){
            smallestNum=num2;
        }

        if (smallestNum> num3){
            smallestNum=num3;
        }
        return smallestNum;
    }
}
