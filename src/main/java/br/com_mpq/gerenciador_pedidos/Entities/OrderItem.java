package br.com_mpq.gerenciador_pedidos.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {
    private Long idOrderItem;
    private Product product;
    private Order order;
    private String detailClient;
    private int quantity;
}
