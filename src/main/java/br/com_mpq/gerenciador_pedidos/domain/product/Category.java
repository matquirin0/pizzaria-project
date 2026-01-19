package br.com_mpq.gerenciador_pedidos.domain.product;

import br.com_mpq.gerenciador_pedidos.domain.order.StatusOrder;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Category {
    FOOD(1),
    DRINK(2);

    private int code;

    public static Category valueOf(int code) {
        for (Category value : Category.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid StatusOrder code");
    }
}
