package guru.springframework.services;

import guru.springframework.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by jt on 3/27/15.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> listProducts() {
        ArrayList<Product> products = new ArrayList<Product>(2);
        products.add(new Product("Product 1 description"));
        products.add(new Product("Product 2 description"));
        return products;
    }
}
