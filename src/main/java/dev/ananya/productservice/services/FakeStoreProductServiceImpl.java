package dev.ananya.productservice.services;

import dev.ananya.productservice.model.Product;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service(("FakeStoreProductServiceImpl"))
public class FakeStoreProductServiceImpl implements ProductService{
    private RestTemplateBuilder restTemplateBuilder;
    public FakeStoreProductServiceImpl(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplateBuilder = restTemplateBuilder;
    }
    @Override
    public String getProductById(Long id) {
        //Product product = new Product();
        RestTemplate restTemplate = restTemplateBuilder.build();
        restTemplate.getForEntity("http://localhost:8080/products/" + id, Product.class);
        return "Here is Product Id: "+id;
    }

}
