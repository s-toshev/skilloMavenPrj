package Lession04;

public class problem6 {
    public static void main(String[] args) {

        int[] list1 = {12, 15, 32, 42, 55,
                75, 122, 132, 150, 180, 200};

        int number = 0;

        for (int i = 0; i < list1.length; i++) {
            number = list1[i];
            if (number % 5 == 0 && number < 150) {
                System.out.printf("%d ", number);

            }
        }
    }
}

