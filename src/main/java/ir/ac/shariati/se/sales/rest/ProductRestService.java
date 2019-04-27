package ir.ac.shariati.se.sales.rest;

import ir.ac.shariati.se.sales.entity.Product;
import ir.ac.shariati.se.sales.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductRestService {

    @Autowired
    ProductService productService;

    @GetMapping(path = "/find/{id}")
    public Product findById(@PathVariable(name = "id") Integer id) {
        return productService.findById(id);
    }

    @PostMapping(path = "/save")
    public void saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @PutMapping(path = "/update")
    public Product updateProduct(@RequestBody Product product) {
        return productService.updateProduct(product);
    }

    @DeleteMapping(path = "/delete/{id}")
    public void deleteProduct(@PathVariable(name = "id") Integer id) {
        productService.deleteProduct(id);
    }
}
