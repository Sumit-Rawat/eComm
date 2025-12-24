package org.ecommerce.controller;

import org.ecommerce.dto.ProductDto;
import org.ecommerce.service.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    private final IProductService productService;

    ProductController(IProductService _productService) {
        this.productService = _productService;
    }

    @GetMapping
    List<ProductDto> getProducts() throws IOException {
        return productService.getAllProducts();
    }
}
