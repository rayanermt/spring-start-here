package learnspring.c8ex1.service;

import learnspring.c8ex1.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productsList = new ArrayList<>();

    public void addProduct(Product product) {
        productsList.add(product);
    }

    public List<Product> findAll() {
        return productsList;
    }
}
