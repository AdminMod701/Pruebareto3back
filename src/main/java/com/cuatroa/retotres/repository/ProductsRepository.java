package com.cuatroa.retotres.repository;

import com.cuatroa.retotres.model.Products;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cuatroa.retotres.repository.crud.ProductsCrudRepository;

/**
 *
 * @author desaextremo
 */
@Repository
public class ProductsRepository {
    @Autowired
    private ProductsCrudRepository ProductsCrudRepository;

    public List<Products> getAll() {
        return ProductsCrudRepository.findAll();
    }

    public Optional<Products> getProduct(Integer id) {
        return ProductsCrudRepository.findById(id);
    }
    
    public Products create(Products products) {
        return ProductsCrudRepository.save(products);
    }

    public void update(Products accesory) {
        ProductsCrudRepository.save(accesory);
    }
    
    public void delete(Products accesory) {
        ProductsCrudRepository.delete(accesory);
    }
}
