package com.levo.services;

import com.levo.domain.Product;
import com.levo.persistence.ProductPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements ICrudService<Product, Long> {

    @Autowired
    private ProductPersistence productPersistence;

    public ProductService() {
    }

    @Override
    public List<Product> getAll() {
        List<Product> productList = productPersistence.findAll();
        return productList;
    }

    @Override
    public Product getById(Long id) {
        Product product = productPersistence.findOne(id);
        return product;
    }

    @Override
    public Product create(Product entity) {
        return productPersistence.save(entity);
    }

    @Override
    public Product remove(Product entity) {
        productPersistence.delete(entity);
        return entity;
    }

    @Override
    public Product update(Product entity) {
        return productPersistence.save(entity);
    }
}
