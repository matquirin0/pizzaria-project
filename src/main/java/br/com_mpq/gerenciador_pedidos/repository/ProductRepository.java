package br.com_mpq.gerenciador_pedidos.repository;

import br.com_mpq.gerenciador_pedidos.domain.product.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
