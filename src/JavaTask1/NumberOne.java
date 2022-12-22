package JavaTask1;

import java.util.Scanner;

public class NumberOne {
    public static void main(String[] args) throws Exception {

        // static
        String firstName = "Bernanda";
        String lastName = "Fredya Putri";
        String birthPlace = "Kediri";
        String birthYear = "1998";
        String progLangFav = "Java and Kotlin";

        System.out.println("Name : " + firstName + " " + lastName);
        System.out.println("Birth : " + birthPlace + " " + birthYear);
        System.out.println("Programming Language Favorite : " + progLangFav);

        // with scanner
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("First Name: ");
            firstName = input.nextLine();
            System.out.print("Laat Name: ");
            lastName = input.nextLine();
            System.out.print("Birth Place: ");
            birthPlace = input.nextLine();
            System.out.print("Birth Year: ");
            birthYear = input.nextLine();
            System.out.print("Programming Languange: ");
            progLangFav = input.nextLine();

            System.out.println();
            System.out.println("Name : " + firstName + " " + lastName);
            System.out.println("Birth : " + birthPlace + " " + birthYear);
            System.out.println("Programming Language Favorite : " + progLangFav);
        }
    }
}
