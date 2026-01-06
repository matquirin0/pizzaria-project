package br.com_mpq.gerenciador_pedidos.Entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum StatusOrder {
    CONFIRMATION(1),
    PREPARATION(2),
    READY(3),
    CANCELLED(4);

    private int code;

    public static StatusOrder valueOf(int code) {
        for (StatusOrder value : StatusOrder.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid StatusOrder code");
    }
}
