package JavaTask4.services.order;

import java.util.List;

import JavaTask4.models.Order;
import JavaTask4.repositories.OrderRepository;
import JavaTask4.services.base.BaseServices;
import JavaTask4.services.base.QuestionService;

public class OrderServiceImpl implements OrderService {

    private OrderRepository orderRepository;

    public OrderServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void addOrder(String menuType) {
        Order order = new Order();
        order = BaseServices.addOrder(menuType);
        orderRepository.save(order);
    }

    @Override
    public void showAllOrder() {
        List<Order> orders = orderRepository.findAll();
        System.out.println();
        System.out.println(
                "============================================ DAFTAR PESANAN ============================================");
        int i = 1;
        double total = 0.0, subTotal, grandTotal;

        for (Order order : orders) {
            System.out.println(i + ". " + order.getMenu().getMenuName());
            subTotal = order.getQuantity() * order.getMenu().getMenuPrice();
            total = total + subTotal;
            System.out.println("\t" + order.getQuantity() + " x " + order.getMenu().getMenuPrice() + ": " + subTotal);
            i++;
        }

        grandTotal = ((0.11) * total) + total;
        System.out.println("Total harga setelah PPN (11%): " + grandTotal);
        System.out.println();
    }

    @Override
    public void updateOrder() {
        Integer index = QuestionService.questionInteger("Silahkan input nomor pesanan paket: ");
        Order order = orderRepository.findById(index);
        order = BaseServices.wantToEdit(order);
        if (order.getQuantity() == 0) {
            orderRepository.delete(index);
        } else {
            orderRepository.update(order, index);
        }
    }

}
