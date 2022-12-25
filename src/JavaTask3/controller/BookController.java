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
        if (book.getTitle() == null || book.getAuthor() == null) {
            System.out.println("You haven't save any book, please add some!");
            System.out.println();
        } else {
            System.out.println(bookDao.findAll());
        }
    }

    public void showById() {
        if (book.getTitle() == null || book.getAuthor() == null) {
            System.out.println("You haven't save any book, please add some!");
            System.out.println();
        } else {
            System.out.println();
            System.out.print("Book ID: ");
            id = Integer.valueOf(input.nextLine());
            System.out.println(bookDao.findById(id));
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
        System.out.println();
        System.out.print("Book ID: ");
        id = Integer.valueOf(input.nextLine());
        System.out.println(bookDao.findById(id));

        System.out.print("Update book title: ");
        book.setTitle(input.nextLine());
        System.out.print("Update book author: ");
        book.setAuthor(input.nextLine());
        bookDao.update(book, id);

        System.out.println("Book " + id + " successfully updated!");
    }

    public void deleteBook() {
        System.out.println();
        System.out.print("Book ID: ");
        id = Integer.valueOf(input.nextLine());
        bookDao.delete(id);

        System.out.println("Book " + id + " successfully deleted!");
    }
}
