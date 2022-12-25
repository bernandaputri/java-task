package JavaTask3.service;

import java.util.List;

public interface DaoService<T, K> {  // T : tipe data dari models, K : tipe data ID / key
    // menyimpan methods findAll, findById, save, update, delete
    List<T> findAll(); // menampilkan list semua data T

    T findById(K id); // menampilkan single object T dengan parameter K sebagai id-nya
    
    void save(T data); // menyimpan data T

    void update(T data, K id); // update data pada id K berisi data T

    void delete(K id); // delete data dengan id K

}
