package br.com_mpq.gerenciador_pedidos.domain.product;

import br.com_mpq.gerenciador_pedidos.domain.orderItem.Category;
import br.com_mpq.gerenciador_pedidos.domain.orderItem.OrderItem;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "tb_product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idProduct;

    @JsonIgnore
    @OneToMany(mappedBy = "product")
    private List<OrderItem> items;

    private String name;
    private Category category;
    private String description;
    private BigDecimal price;
}
