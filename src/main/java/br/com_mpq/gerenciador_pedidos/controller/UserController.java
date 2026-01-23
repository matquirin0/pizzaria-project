package br.com_mpq.gerenciador_pedidos.controller;

import br.com_mpq.gerenciador_pedidos.domain.user.User;
import br.com_mpq.gerenciador_pedidos.domain.user.UserRequestDTO;
import br.com_mpq.gerenciador_pedidos.service.UserService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    ResponseEntity<Void> createUser(@RequestBody UserRequestDTO requests){
        userService.createUser(requests);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    ResponseEntity<List<User>> listAll(){
        List<User> users = userService.listUser();
            return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<User> findById(@PathVariable Long id) {
        return ResponseEntity.ok(userService.findById(id));
    }
}