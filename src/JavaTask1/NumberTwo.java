package JavaTask1;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberTwo {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            int[] firstArray = new int[4];
            int[] secondArray = new int[4];

            ArrayList<Integer> sameElement = new ArrayList<Integer>();

            for (int i = 0; i < firstArray.length; i++) {
                System.out.print("Enter element-" + (i+1) + ": ");
                firstArray[i] = Integer.valueOf(input.nextLine());
            }

            // for (int i : firstArray) {
            //     System.out.print(i+", ");
            // }

            System.out.println();

            for (int j = 0; j < secondArray.length; j++) {
                System.out.print("Enter element-" + (j+1) + ": ");
                secondArray[j] = Integer.valueOf(input.nextLine());
            }

            // for (int i : secondArray) {
            //     System.out.print(i+", ");
            // }

            for (int a : firstArray) {
                for (int b : secondArray) {
                    if ( a == b ) {
                        sameElement.add(a);
                    }
                }
            }
            
            System.out.println(sameElement);
        }
    }
}
