package br.com_mpq.gerenciador_pedidos.repository;

import br.com_mpq.gerenciador_pedidos.domain.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
