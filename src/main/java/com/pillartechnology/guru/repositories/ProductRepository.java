package com.pillartechnology.guru.repositories;

import com.pillartechnology.guru.domain.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

/**
 * Created by erinbergman on 2/8/17.
 */

@Component
public interface ProductRepository extends CrudRepository<Product, Integer> {
}
