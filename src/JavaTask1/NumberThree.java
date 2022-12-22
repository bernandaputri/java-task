package JavaTask1;

import java.util.Scanner;

public class NumberThree {
    public static void main(String[] args) throws Exception {
        try (Scanner input = new Scanner(System.in)) {
            int[] arrNumber = new int[5];

            for (int i = 0; i < arrNumber.length; i++) {
                System.out.print("Enter element-" + (i+1) + ": ");
                arrNumber[i] = Integer.valueOf(input.nextLine());
            }

            // for (int i : firstArray) {
            //     System.out.print(i+", ");
            // }

            for (int i = 0; i < arrNumber.length;  i++) {
                for (int j = i + 1; j < arrNumber.length; j++) {
                    int temp = 0;
                    if (arrNumber[i] > arrNumber[j]) {
                        temp = arrNumber[i];
                        arrNumber[i] = arrNumber[j];
                        arrNumber[j] = temp;
                    }
                }
            }

            for (int i : arrNumber) {
                System.out.print(i+" ");
            }
        }
    }
}
