package com.example;

import fete.bird.IProduct;
import io.micronaut.http.annotation.*;

@Controller("/product")
public class ProductController {
    private final IProduct iProduct;

    public ProductController(IProduct iProduct) {
        this.iProduct = iProduct;
    }

    @Get(uri="/", produces="text/plain")
    public String index() {
        return iProduct.convertToUpperCase("Test");
    }
}