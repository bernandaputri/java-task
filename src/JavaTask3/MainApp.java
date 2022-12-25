package JavaTask3;

import java.util.Scanner;

import JavaTask3.controller.BookController;

public class MainApp {
    static Scanner input = new Scanner(System.in);
    static BookController bookController = new BookController();
    static String option;

    private static void appMenu() {
        System.out.println("==========BOOK INFORMATION SYSTEM==========");
        System.out.println("1. Show All Books Data");
        System.out.println("2. Find Books by ID");
        System.out.println("3. Add New Book");
        System.out.println("4. Update Book Detail");
        System.out.println("5. Delete Book by ID");
        System.out.print("Enter your option: ");
        option = input.nextLine();
    }

    public static void main(String[] args) {
        do {
            appMenu();

            switch (option) {
                case "1":
                    bookController.showData();
                    break;

                case "2":
                    bookController.showById();
                    break;

                case "3":
                    bookController.saveBook();
                    break;

                case "4":
                    bookController.updateBook();
                    break;

                case "5":
                    bookController.deleteBook();
                    break;

                default:
                    break;
            }
            System.out.print("Do you want to exit menu? (y/n) ");
            option = input.nextLine();
        } while (option.equalsIgnoreCase("n"));
    }
}
