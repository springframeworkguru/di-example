package guru.springframework.services;

import guru.springframework.domain.Product;

import java.util.List;

/**
 * Created by jt on 3/27/15.
 */
public interface ProductService {

    List<Product> listProducts();
}
