package JavaTask4.repositories;

import java.util.ArrayList;
import java.util.List;

import JavaTask4.models.Order;
import JavaTask4.services.DaoService;

public class OrderRepository implements DaoService<Order, Integer> {

    List<Order> orders = new ArrayList<>();

    @Override
    public void delete(Integer id) {
        orders.remove(id-1);
    }

    @Override
    public List<Order> findAll() {
        return orders;
    }

    @Override
    public void save(Order data) {
        orders.add(data);
    }

    @Override
    public void update(Order data, Integer id) {
        orders.set(id-1, data);
    }

    @Override
    public Order findById(Integer id) {
        return orders.get(id-1);
    }

    @Override
    public void clearData() {
        orders.clear();
    }
}
