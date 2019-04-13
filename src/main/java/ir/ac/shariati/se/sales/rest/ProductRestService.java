package ir.ac.shariati.se.sales.rest;

import ir.ac.shariati.se.sales.entity.Product;
import ir.ac.shariati.se.sales.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductRestService {

    @Autowired
    ProductService productService;

    @GetMapping(path = "/find/{id}")
    public Product findById(@PathVariable(name = "id") Integer id) {
        return productService.findById(id);
    }

}
