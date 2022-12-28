package JavaTask4.services;

import java.util.List;

public interface DaoService<T, K> {
    List<T> findAll();
    void save(T data);
    void update(T data, K id);
    void delete(K id);
}
