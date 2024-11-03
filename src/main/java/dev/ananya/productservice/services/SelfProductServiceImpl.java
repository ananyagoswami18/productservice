package dev.ananya.productservice.services;

import dev.ananya.productservice.model.Product;
import org.springframework.stereotype.Service;

@Service("SelfProductServiceImpl")
public class SelfProductServiceImpl implements ProductService{
    @Override
    public String getProductById(Long id) {
        return null;
    }
}
