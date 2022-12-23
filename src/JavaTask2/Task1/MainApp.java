package JavaTask2.Task1;

import java.util.Scanner;

public class MainApp {
    static Scanner input = new Scanner(System.in);
    static Person person;
    static Education education;
    static String option;

    public static void menu() {
        System.out.println("=== SISTEM INFORMASI BIODATA ===");
        System.out.println("1. Input Your Biodata");
        System.out.println("2. Input Your Education Data");
        System.out.println("3. Show Your Biodata");
        System.out.println("4. Show Education Data");
        System.out.print("Enter your option: ");
        option = input.nextLine();
    }

    public static void main(String[] args) {
        do {
            System.out.println();

            menu();

            switch (option) {
                case "1":
                    System.out.print("Enter your first name: ");
                    String firstName = input.nextLine();
                    System.out.print("Enter your last name: ");
                    String lastName = input.nextLine();
                    System.out.print("Enter your birth year: ");
                    String birthYear = input.nextLine();
                    System.out.print("Enter your domicile: ");
                    String domicile = input.nextLine();

                    person = new Person(firstName, lastName, domicile, birthYear);
                    break;

                case "2":
                    System.out.print("Elementary School: ");
                    String elementary = input.nextLine();
                    System.out.print("Junior High School: ");
                    String juniorHigh = input.nextLine();
                    System.out.print("Senior High School: ");
                    String seniorHigh = input.nextLine();
                    System.out.print("Undergraduate Degree: ");
                    String underGrad = input.nextLine();

                    education = new Education(elementary, juniorHigh, seniorHigh, underGrad);
                    break;

                case "3":
                    System.out.println("Fullname : " + person.getFirstName() + " " + person.getLastName());
                    int birth = Integer.parseInt(person.getBirthYear());
                    int age = 2022 - birth;
                    System.out.println("Age : " + Integer.toString(age) + " years old");
                    System.out.println("Domicile : " + person.getDomicile());
                    System.out.println();
                    break;

                case "4":
                    System.out.println("Elementary School: " + education.getElementary());
                    System.out.println("Junior High School: " + education.getJuniorHigh());
                    System.out.println("Senior High School: " + education.getSeniorHigh());
                    System.out.println("Undergraduate Degree: " + education.getUnderGrad());
                    System.out.println();
                    break;

                default:
                    System.out.println("Wrong input.");
                    break;
            }
            System.out.print("Do you want to exit? (y/n) ");
            option = input.nextLine();
        } while (option.equalsIgnoreCase("n"));
    }
}
