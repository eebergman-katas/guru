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
        shirt.setImageUrl("http://www.iconsdb.com/icons/preview/green/t-shirt-xxl.png");
        shirt.setProductId("235268845711068308");
        productRepository.save(shirt);

        System.out.println("Saved Shirt");


        Product mug = new Product();
        mug.setDescription("Green Mug");
        mug.setPrice(new BigDecimal("3.50"));
        mug.setImageUrl("../static/images/greenmug.jpeg");
        mug.setProductId("2352688");
        productRepository.save(mug);

        System.out.println("Saved Mug");

    }
}
