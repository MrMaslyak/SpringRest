package com.maslyak.practicRest.service;


import com.maslyak.practicRest.dto.ProductDTO;
import com.maslyak.practicRest.entity.Product;
import com.maslyak.practicRest.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product createProduct(ProductDTO dto) {
        Product product = Product.builder()
                .name(dto.getName())
                .amount(dto.getAmount())
                .build();
        return productRepository.save(product);
    }


    public List<Product> readAll () {
        return productRepository.findAll();
    }

    public Product update(Product product) {
        return productRepository.save(product);
    }

    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}
