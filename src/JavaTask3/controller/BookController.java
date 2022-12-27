package JavaTask3.controller;

import java.util.Scanner;

import JavaTask3.model.Book;
import JavaTask3.repository.BookRepository;
import JavaTask3.service.DaoService;

public class BookController {
    static Scanner input = new Scanner(System.in);
    private static DaoService<Book, Integer> bookDao = new BookRepository();
    private Book book = new Book();
    private int id;
    private String bookOption;

    public void showData() {
        System.out.println();
        if (bookDao.findAll().isEmpty()) {
            System.out.println("You haven't save any book, please add some!");
            System.out.println();
        } else {
            System.out.println(bookDao.findAll());
            // System.out.println(bookDao.findAll().size());
        }
    }

    public void showById() {
        if (bookDao.findAll().isEmpty()) {
            System.out.println("You haven't save any book, please add some!");
            System.out.println();
        } else {
            System.out.println();
            System.out.print("Book ID: ");
            id = Integer.valueOf(input.nextLine());

            if (id > bookDao.findAll().size()) {
                System.out.println("Book with ID " + id + " doesn't exist.");
            } else {
                System.out.println(bookDao.findById(id));
            }
        }
    }

    public void saveBook() {
        do {
            book = new Book();

            System.out.println();
            System.out.print("Book title: ");
            book.setTitle(input.nextLine());
            System.out.print("Book author: ");
            book.setAuthor(input.nextLine());

            bookDao.save(book);

            System.out.println();
            System.out.print("Add another book? (y/n) ");
            bookOption = input.nextLine();
        } while (bookOption.equalsIgnoreCase("y"));
    }

    public void updateBook() {
        if (bookDao.findAll().isEmpty()) {
            System.out.println("You haven't save any book, please add some!");
            System.out.println();
        } else {
            System.out.println();
            System.out.print("Book ID: ");
            id = Integer.valueOf(input.nextLine());

            if (id > bookDao.findAll().size()) {
                System.out.println("Book with ID " + id + " doesn't exist.");
            } else {
                System.out.println(bookDao.findById(id));
                System.out.print("Update book title: ");
                book.setTitle(input.nextLine());
                System.out.print("Update book author: ");
                book.setAuthor(input.nextLine());
                bookDao.update(book, id);

                System.out.println("Book " + id + " successfully updated!");
                System.out.println();
            }
        }
    }

    public void deleteBook() {
        if (bookDao.findAll().isEmpty()) {
            System.out.println("You haven't save any book, please add some!");
            System.out.println();
        } else {
            System.out.println();
            System.out.print("Book ID: ");
            id = Integer.valueOf(input.nextLine());

            if (id > bookDao.findAll().size()) {
                System.out.println("Book with ID " + id + " doesn't exist.");
            } else {
                bookDao.delete(id);

                System.out.println("Book " + id + " successfully deleted!");
                System.out.println();
            }
        }
    }
}
