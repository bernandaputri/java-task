package JavaTask3.service;

import java.util.List;

public interface DaoService<T, K> {
    // menyimpan methods findAll, findById, save, update, delete
    List<T> findAll();

    T findById(K id);
    
    void save(T data);

    void update(T data, K id);

    void delete(K id);

}
