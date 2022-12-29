package JavaTask4.controller;

import JavaTask4.repositories.OrderRepository;
import JavaTask4.services.base.BaseServices;
import JavaTask4.services.order.OrderService;
import JavaTask4.services.order.OrderServiceImpl;

public class OrderController {

    private OrderService orderService;

    public OrderController(OrderRepository orderRepository) {
        this.orderService = new OrderServiceImpl(orderRepository);
    }

    public void saveOrders(String menuType) {
        Boolean addOrder = true;
        String label = "tambah";
        while (addOrder) {
            switch (label) {
                case "tambah":
                    orderService.addOrder(menuType);
                    orderService.showAllOrder();
                    label = BaseServices.action();
                    break;

                case "ubah":
                    orderService.updateOrder();
                    orderService.showAllOrder();
                    label = BaseServices.action();
                    break;

                case "kembali":
                    addOrder = false;
                    break;

                default:
                    label = BaseServices.action();
                    break;
            }
        }
    }

}
