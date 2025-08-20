package online.shopre.product.controller;

import online.shopre.product.model.Product;
import online.shopre.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    // this needs to  be converted to be an admin API.
    @PostMapping
    public Product createProduct(@RequestBody Product product){
        return productService.createProduct(product);
    }


    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    // get by slug.
    @GetMapping("/slug/{slug}")
    public Product getProductBySlug(@PathVariable String slug){
        return productService.getProductBySlug(slug);
    }

    // get by id.
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable UUID id){
        return productService.getProduct(id);
    }


}
