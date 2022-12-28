package JavaTask4.controller;

import java.util.List;
import java.util.Scanner;

import JavaTask4.models.Menu;
import JavaTask4.models.Order;
import JavaTask4.repositories.MenuRepository;
import JavaTask4.repositories.OrderRepository;
import JavaTask4.services.DaoService;
import JavaTask4.services.MenuService;

public class OrderController {
    static Scanner input = new Scanner(System.in);
    private DaoService<Order, Integer> orderDao = new OrderRepository();
    private MenuService<Menu, Integer> menuService = new MenuRepository();
    private Order order = new Order();
    private List<Order> orders;
    private int index;
    private double subTotal = 0, total = 0;
    String addOrder;

    public void showOrders() {
        System.out.println();
        orders = orderDao.findAll();
        if (orders.isEmpty()) {
            System.out.println("Anda belum menambahkan pesanan, silahkan akses menu pemesanan.");
            System.out.println();
        } else {
            int i = 1;
            for (Order order : orders) {
                subTotal = order.getQuantity() * order.getPrice();
                System.out.println(i + ". " + order.getChosenMenu());
                System.out.println(order.getQuantity() + " x " + order.getPrice() + " = " + subTotal);
                total = subTotal + (subTotal * 0.11);
                System.out.println("Total harga setelah PPN (11%): " + Double.toString(total));
                i++;
            }
        }
    }

    public void saveOrders() {
        index = Integer.parseInt(addOrder);
        System.out.println();
    }
}
