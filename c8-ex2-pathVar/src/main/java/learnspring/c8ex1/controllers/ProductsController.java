package learnspring.c8ex1.controllers;

import learnspring.c8ex1.model.Product;
import learnspring.c8ex1.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {
    private final ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

//    GET Action: Show all products on the list.
    @RequestMapping("/products")
    public String viewProducts(Model model) {   // The Model parameter sends data to the view.
        var productsList = productService.findAll();
        model.addAttribute("products", productsList);

        System.out.println("GET Action: Showing updated product list.");

        return "products.html";
    }

//    POST Action: Create a new product.
    @PostMapping(path = "/products")        // Specific path to the controller's POST action.
    public String addProduct(@RequestParam String name,
                             @RequestParam double price,
                             Model model) {
        Product newProduct = new Product();

        newProduct.setName(name);
        newProduct.setPrice(price);
        productService.addProduct(newProduct);

        System.out.println("POST Action: Added new product to List<Produt>:" + newProduct.getName() + newProduct.getPrice());

        return "products.html";
    }
}
