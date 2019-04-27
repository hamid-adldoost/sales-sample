package ir.ac.shariati.se.sales.service;

import ir.ac.shariati.se.sales.dao.ProductDao;
import ir.ac.shariati.se.sales.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductService {

    @Autowired
    ProductDao productDao;

    public Product findById(Integer id) {

        return productDao.findById(id);
    }

    @Transactional
    public void saveProduct(Product product) {
        productDao.saveProduct(product);
    }

    @Transactional
    public Product updateProduct(Product product) {
        return productDao.updateProduct(product);
    }

    @Transactional
    public void deleteProduct(Integer id) {
        productDao.deleteProduct(id);
    }

}
