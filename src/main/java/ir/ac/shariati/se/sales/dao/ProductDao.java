package ir.ac.shariati.se.sales.dao;

import ir.ac.shariati.se.sales.entity.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class ProductDao {

    @PersistenceContext
    EntityManager entityManager;


    public Product findById(Integer id) {

        List<Product> productList = this.entityManager.createQuery(
                "select p from Product p where p.id = :id ", Product.class)
                .setParameter("id", id)
                .getResultList();

        if (productList == null || productList.isEmpty())
            return null;
        else
            return productList.get(0);
    }

    public void saveProduct(Product product) {

        entityManager.persist(product);

    }

    public Product updateProduct(Product product) {

        return entityManager.merge(product);

    }

    public void deleteProduct(Integer id) {

        Product product = entityManager.find(Product.class, id);

        entityManager.remove(product);
    }

}
