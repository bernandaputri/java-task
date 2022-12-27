package JavaTask3.controller;

import java.util.List;
import java.util.Scanner;

import JavaTask3.model.Book;
import JavaTask3.repository.BookRepository;
import JavaTask3.service.DaoService;

public class BookController {
    static Scanner input = new Scanner(System.in);
    private DaoService<Book, Integer> bookDao = new BookRepository(); 
    private Book book = new Book();
    private List<Book> books;
    private int id;
    private String bookOption;

    public void showData() {
        System.out.println();
        books = bookDao.findAll();
        if (books.isEmpty()) {
            System.out.println("You haven't save any book, please add some!");
            System.out.println();
        } else {
            int i = 1;
            for (Book book : books) {
                System.out.println("Book ID: " + i);
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println();
                i++;
            }
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

            if (id > books.size()) {
                System.out.println("Book with ID " + id + " doesn't exist.");
            } else {
                bookDao.findById(id);
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println();
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
        books = bookDao.findAll();
        if (books.isEmpty()) {
            System.out.println("You haven't save any book, please add some!");
            System.out.println();
        } else {
            System.out.println();
            System.out.print("Book ID: ");
            id = Integer.valueOf(input.nextLine());

            if (id > books.size()) {
                System.out.println("Book with ID " + id + " doesn't exist.");
            } else {
                bookDao.findById(id);
                System.out.println("Title: " + book.getTitle());
                System.out.println("Author: " + book.getAuthor());
                System.out.println();
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
