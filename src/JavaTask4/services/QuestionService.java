package JavaTask4.services;

import java.util.Scanner;

public class QuestionService {
    static Scanner input = new Scanner(System.in);

    public static String questionString(String question) {
        System.out.print(question);
        return input.nextLine();
    }
    
    public static Integer questionInteger(String question) {
        System.out.print(question);
        return Integer.valueOf(input.nextLine());
    }
}
