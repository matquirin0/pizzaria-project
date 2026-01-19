package br.com_mpq.gerenciador_pedidos.service;

import br.com_mpq.gerenciador_pedidos.domain.product.Product;
import br.com_mpq.gerenciador_pedidos.domain.product.ProductRequestDTO;
import br.com_mpq.gerenciador_pedidos.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public void createAll(List<ProductRequestDTO> dtos){

        List<Product> productsToSave = new ArrayList<>();

        for (ProductRequestDTO dto : dtos){
            Product newProduct = new Product(dto);
            productsToSave.add(newProduct);
        }

        productRepository.saveAll(productsToSave);

    }

    public List<Product> listProduct(){
        return productRepository.findAll();
    }

    public Optional<Product> findId(Long id){
        return productRepository.findById(id);
    }

    public List<Product> saveProduct (List<Product> products){

        return productRepository.saveAll(products);
    }

    public void deleteProduct(Long id){
        productRepository.deleteById(id);
    }
}
