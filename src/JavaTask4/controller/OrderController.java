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
        String label = "add";
        while (addOrder) {
            switch (label) {
                case "add":
                    orderService.addOrder(menuType);
                    orderService.showAllOrder();
                    label = BaseServices.action();
                    break;

                case "change":
                    orderService.updateOrder();
                    orderService.showAllOrder();
                    label = BaseServices.action();
                    break;

                case "back":
                    addOrder = false;
                    break;

                default:
                    label = BaseServices.action();
                    break;
            }
        }
    }

}
