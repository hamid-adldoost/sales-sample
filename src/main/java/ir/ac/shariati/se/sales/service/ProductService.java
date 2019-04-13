package ir.ac.shariati.se.sales.service;

import ir.ac.shariati.se.sales.dao.ProductDao;
import ir.ac.shariati.se.sales.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    ProductDao productDao;

    public Product findById(Integer id) {

        return productDao.findById(id);
    }

}
