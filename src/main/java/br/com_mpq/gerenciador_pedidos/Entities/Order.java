package br.com_mpq.gerenciador_pedidos.Entities;

import java.util.List;

import br.com_mpq.gerenciador_pedidos.Entities.enums.PaymentMethod;
import br.com_mpq.gerenciador_pedidos.Entities.enums.StatusOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Order {
    private Long idOrder;
    private List<OrderItem> order;
    private BigDecimal price;
    private StatusOrder statusOrder;
    private PaymentMethod statusPayment;
    private Date orderHour;

    public BigDecimal getTotalValue() {
        return order.stream()
                .map(item -> item.getProduct().getPrice().multiply(new BigDecimal(item.getQuantity())))
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
