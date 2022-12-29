package JavaTask4.services.receipt;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import JavaTask4.models.Order;
import JavaTask4.repositories.OrderRepository;
import JavaTask4.services.base.QuestionService;

public class ReceiptServiceImpl implements ReceiptService {

    private OrderRepository orderRepository;

    public ReceiptServiceImpl(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public void printReceipt() {
        List<Order> orders = orderRepository.findAll();
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy hh:mm:ss");
        String date = dateTime.format(format);
        double amountPayment = 0.0, amountChange = 0.0, total = 0.0, subTotal = 0.0, grandTotal = 0.0;
        int i = 1;
        Boolean state = true;

        System.out.println("============================================ BUKTI PEMBAYARAN ============================================");
        System.out.println("||\t\t\t\t\t\t\t\t\t\t\t\t\t||");
        System.out.println("||\t\t\t\t\t   " + date + "   \t\t\t\t\t||");
        System.out.println("||\t\t\t\t\t\t\t\t\t\t\t\t\t||");
        System.out.println("============================================= DAFTAR PESANAN =============================================");

        for (Order order : orders) {
            System.out.println(i + ". " + order.getMenu().getMenuName());
            subTotal = order.getQuantity() * order.getMenu().getMenuPrice();
            total = total + subTotal;
            System.out.println("\t" + order.getQuantity() + " x " + order.getMenu().getMenuPrice() + ": " + subTotal);
            i++;
        }

        grandTotal = ((0.11) * total) + total;
        System.out.println("Total harga setelah PPN (11%): " + grandTotal);
        System.out.println("Total Harga: " + total);
        System.out.println("Biaya PPN (11%): " + (grandTotal - total));
        System.out.println("Total harga pembelian: " + grandTotal);

        while (state) {
            amountPayment = QuestionService.questionDouble("Uang Tunai: ");
            if (amountPayment < grandTotal) {
                System.out.println("Uang tunai tidak mencukupi.");
            } else {
                state = false;
            }
        }

        amountChange = amountPayment - grandTotal;
        System.out.println("Kembalian: " + amountChange);

    }

}
