package dev.ananya.productservice.controllers;

import dev.ananya.productservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController()
@RequestMapping("/api/v1/products")
public class ProductController {
    //Field Injection
//    @Autowired
//    private ProductService productService;

    //Contructor Injection --> This is the best for dependency injection
    private ProductService productService;
    public ProductController(@Qualifier("FakeStoreProductServiceImpl") ProductService productService) {
        this.productService = productService;
    }

    //Setter Injection
//     @Autowired
//     public void setProductService(ProductService productService) {
//        this.productService = productService;
//     }

    @GetMapping
    public void getAllProducts()
    {

    }
    @GetMapping("{id}")
    public String getProductById(@PathVariable("id") Long id)
    {
    return productService.getProductById(id);
    }
    @DeleteMapping("{id}")
    public void deleteProductById()
    {

    }
    @PostMapping("")
    public String createProduct()
    {
    return "Created new product with id: " + UUID.randomUUID();
    }
    @PutMapping("{id}")
    public void updateProductById()
    {

    }

}
