package orderwijmotopping.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import orderwijmotopping.OrderApplication;

@Entity
@Table(name = "Order_table")
@Data
public class Order {

    @Id
    private String orderId;

    private String orderType;

    private Payment payment;

    @Embedded
    private UserId userId;

    public static OrderRepository repository() {
        OrderRepository orderRepository = OrderApplication.applicationContext.getBean(
            OrderRepository.class
        );
        return orderRepository;
    }
}
