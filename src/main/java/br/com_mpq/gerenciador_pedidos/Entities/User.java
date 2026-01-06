package br.com_mpq.gerenciador_pedidos.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Long idUser;
    private String nome;
    private String cellphone;
    private String email;
    private String password;
}
