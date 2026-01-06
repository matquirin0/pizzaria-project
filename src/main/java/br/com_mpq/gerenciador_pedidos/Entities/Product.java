package br.com_mpq.gerenciador_pedidos.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int idProduct;
    private String name;
    private String category;
    private String description;
    private BigDecimal price;
}
