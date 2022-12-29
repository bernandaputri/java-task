package JavaTask4.controller;

import JavaTask4.repositories.OrderRepository;
import JavaTask4.services.receipt.ReceiptService;
import JavaTask4.services.receipt.ReceiptServiceImpl;

public class ReceiptController {
    private ReceiptService receiptService;

    public ReceiptController(OrderRepository orderRepository) {
        this.receiptService = new ReceiptServiceImpl(orderRepository);
    }
    
    public void paymentReceipt() {
        receiptService.printReceipt();
    }
}
