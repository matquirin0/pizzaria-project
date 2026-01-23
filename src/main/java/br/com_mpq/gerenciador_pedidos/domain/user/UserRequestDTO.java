package br.com_mpq.gerenciador_pedidos.domain.user;

public record UserRequestDTO(
        String CPF,
        String name,
        String cellphone,
        String email,
        String password
) {
}
