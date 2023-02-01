package Lession04;

import java.util.Arrays;
import java.util.List;

public class problem7 {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,20,30,40,50);

        for (int i = list.size()-1; i >= 0 ; i--) {
            System.out.printf("%d ",list.get(i));
        }
    }
}
