package br.com_mpq.gerenciador_pedidos.domain.orderItem;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Category {
    DRINK(1),
    FOOD(2),
    ADD_ON(3);

    private int code;

    public static Category valueOf(int code) {
        for (Category value : Category.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid Category code");
    }
}
