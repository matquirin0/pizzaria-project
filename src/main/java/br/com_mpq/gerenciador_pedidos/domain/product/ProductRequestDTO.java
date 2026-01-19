package br.com_mpq.gerenciador_pedidos.domain.product;


import java.math.BigDecimal;

public record ProductRequestDTO(
        String name,
        Category category,
        String description,
        BigDecimal price
        ) {
}
