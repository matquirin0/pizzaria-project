package br.com_mpq.gerenciador_pedidos.Entities.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PaymentMethod {
    PIX(1),
    CREDIT_CARD(2),
    DEBIT(3);

    private int code;

    public static PaymentMethod valueOf(int code) {
        for (PaymentMethod value : PaymentMethod.values()) {
            if (value.getCode() == code) {
                return value;
            }
        }
        throw new IllegalArgumentException("Invalid PaymentMethod code");
    }
}
