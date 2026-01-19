package br.com_mpq.gerenciador_pedidos.controller;

import br.com_mpq.gerenciador_pedidos.domain.product.Product;
import br.com_mpq.gerenciador_pedidos.domain.product.ProductRequestDTO;
import br.com_mpq.gerenciador_pedidos.service.ProductService;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @PostMapping("/bulk")
    public ResponseEntity<Void> createManyProducts(@RequestBody List<ProductRequestDTO> requests){
        productService.createAll(requests);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @GetMapping
    public ResponseEntity<List<Product>> listAll(){
        List<Product> products = productService.listProduct();
        return ResponseEntity.ok(products);
    }
}
