package com.microservice.product_service.service;

import com.microservice.product_service.dto.ProductRequestDTO;
import com.microservice.product_service.dto.ProductResponseDTO;
import com.microservice.product_service.model.Product;
import com.microservice.product_service.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class ProductService {

    private final ProductRepository repository;

    public void createProduct(ProductRequestDTO data) {
        Product product = convertToEntity(data);
        repository.save(product);
        log.info("Product:{} saved", product.getId());
    }

    public List<ProductResponseDTO> getAllProducts() {
        List<Product> products = repository.findAll();
        return products.stream()
                .map(this::convertToDTO)
                .toList();
    }

    public Product convertToEntity(ProductRequestDTO dto) {
        return new Product(null, dto.name(), dto.description(), dto.price());
    }

    public ProductResponseDTO convertToDTO(Product product) {
        return new ProductResponseDTO(product.getId(), product.getName(), product.getDescription(), product.getPrice());
    }
}