package com.pillartechnology.guru.bootstrap;

import com.pillartechnology.guru.domain.Product;
import com.pillartechnology.guru.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.access.method.P;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

/**
 * Created by erinbergman on 2/8/17.
 */

@Component
public class ProductLoader implements ApplicationListener<ContextRefreshedEvent>{

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        Product shirt = new Product();
        shirt.setDescription("Green Shirt");
        shirt.setPrice(new BigDecimal("18.95"));
        shirt.setImageUrl("https://cdn.pixabay.com/photo/2016/10/02/22/17/red-t-shirt-1710578_1280.jpg");
        shirt.setProductId("235268845711068308");
        productRepository.save(shirt);

        System.out.println("Saved Shirt");


        Product mug = new Product();
        mug.setDescription("Green Mug");
        mug.setPrice(new BigDecimal("3.50"));
        mug.setImageUrl("https://cdn.pixabay.com/photo/2014/11/09/19/45/mug-524103_1280.png");
        mug.setProductId("2352688");
        productRepository.save(mug);

        System.out.println("Saved Mug");

    }
}
