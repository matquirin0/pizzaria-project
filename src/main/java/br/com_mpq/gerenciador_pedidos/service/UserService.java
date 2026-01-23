package br.com_mpq.gerenciador_pedidos.service;

import br.com_mpq.gerenciador_pedidos.domain.product.Product;
import br.com_mpq.gerenciador_pedidos.domain.user.User;
import br.com_mpq.gerenciador_pedidos.domain.user.UserRequestDTO;
import br.com_mpq.gerenciador_pedidos.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public void createUser(UserRequestDTO dto){
        User newUser = new User(dto);

        userRepository.save(newUser);
    }

    public List<User> listUser(){
        return userRepository.findAll();
    }

    public User findById(Long id){
        return userRepository.findById(id).
                orElseThrow(() -> new RuntimeException("Usuário não encontrado!"));
    }

    public List<User> saveUser (List<User> users){
        return userRepository.saveAll(users);
    }

    public void deleteProduct(Long id){
        userRepository.deleteById(id);
    }
}


