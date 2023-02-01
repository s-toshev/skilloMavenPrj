package Lession04;

import java.util.Scanner;

public class problem4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numArr = {20,5,66,11,8};

        double maxNum = Integer.MIN_VALUE;
        for (int i = 0; i < numArr.length; i++) {
        if(numArr[i]>maxNum){
            maxNum=numArr[i];
        }
        }

        System.out.printf("The largest number from " +
                "the array is: %.0f",maxNum);
    }
}
