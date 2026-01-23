package br.com_mpq.gerenciador_pedidos.domain.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
@Table(name = "tb_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idUser;
    private String CPF;
    private String name;
    private String cellphone;
    private String email;
    private String password;


//DTO -> Entidade
public User(UserRequestDTO dto) {
    this.CPF = dto.CPF();
    this.name = dto.name();
    this.cellphone = dto.cellphone();
    this.email = dto.email();
    this.password = dto.password();
    }
}
