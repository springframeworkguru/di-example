package guru.springframework.controllers;

import guru.springframework.domain.Product;
import guru.springframework.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Created by jt on 3/27/15.
 */
@Controller
public class MyController {

    private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    public List<Product> getProducts(){
        return productService.listProducts();
    }

}
