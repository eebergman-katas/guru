package com.pillartechnology.guru.services;

import com.pillartechnology.guru.domain.Product;

/**
 * Created by erinbergman on 2/9/17.
 */
public interface ProductService {
    Iterable<Product> listAllProducts();

    Product getProductById(Integer id);

    Product saveProduct(Product product);

    void deleteProduct(Integer id);
}
