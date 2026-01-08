package br.com_mpq.gerenciador_pedidos.repository;

import br.com_mpq.gerenciador_pedidos.domain.orderItem.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
