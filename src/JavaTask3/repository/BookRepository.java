package JavaTask3.repository;

import java.util.ArrayList;
import java.util.List;

import JavaTask3.model.Book;
import JavaTask3.service.DaoService;

public class BookRepository implements DaoService<Book, Integer> {
    // define list book
    List<Book> books = new ArrayList<>();

    @Override
    public List<Book> findAll() {
        // TODO Auto-generated method stub
        return books;
    }

    @Override
    public Book findById(Integer id) {
        // TODO Auto-generated method stub
        return books.get(id-1);
    }

    @Override
    public void save(Book data) {
        // TODO Auto-generated method stub
        books.add(data);
    }

    @Override
    public void update(Book data, Integer id) {
        // TODO Auto-generated method stub
        books.set(id-1, data);
    }

    @Override
    public void delete(Integer id) {
        // TODO Auto-generated method stub
        books.remove(id-1);
    }
}
