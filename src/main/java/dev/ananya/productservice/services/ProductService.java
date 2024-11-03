package dev.ananya.productservice.services;

import dev.ananya.productservice.model.Product;
import org.springframework.stereotype.Service;

@Service
public interface ProductService {
   String getProductById(Long id);
}
