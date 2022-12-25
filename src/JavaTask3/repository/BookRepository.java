package JavaTask3.repository;

import java.util.ArrayList;
import java.util.List;

import JavaTask3.model.Book;
import JavaTask3.service.DaoService;

public class BookRepository implements DaoService<Book, Integer> { // data T dari modelsnya (book); id digambarkan sebagai index dari array
    // define list book
    List<Book> books = new ArrayList<>(); // list dari model Book

    @Override
    public List<Book> findAll() {
        return books;
    }

    @Override
    public Book findById(Integer id) {
        return books.get(id-1);
    }

    @Override
    public void save(Book data) {
        books.add(data);
    }

    @Override
    public void update(Book data, Integer id) {
        books.set(id-1, data);
    }

    @Override
    public void delete(Integer id) {
        books.remove(id-1);
    }
}
