//package com.pillartechnology.guru.repositories;
//
//import com.pillartechnology.guru.configuration.RepositoryConfiguration;
//import com.pillartechnology.guru.domain.Product;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Description;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.math.BigDecimal;
//
//import static org.junit.Assert.*;
//
///**
// * Created by erinbergman on 2/8/17.
// */
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {RepositoryConfiguration.class})
//public class ProductRepositoryTest {
//
//    private ProductRepository productRepository;
//
//
//    @Autowired
//    public void setProductRepository(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//
//    Product testProduct = new Product();
//    Product fetchedProduct = new Product();
//
//    public Product makeAProduct() {
//        Product productToReturn = new Product();
//
//        productToReturn.setDescription("Green Shirt");
//        productToReturn.setPrice(new BigDecimal("18.95"));
//        productToReturn.setProductId("12345");
//        return productToReturn;
//    }
//
//    public Product fetchAProduct() {
//        Product fetchedProductToReturn = new Product();
//
//        return fetchedProductToReturn = productRepository.findOne(testProduct.getId());
//    }
//
//    @Before
//    public void setUp() {
//        testProduct = makeAProduct();
//        fetchedProduct = fetchAProduct();
//    }
//
//    @Test
//    @Description("Should save a Product")
//    public void testSaveProduct() {
//        //save product, verify has productId after save
//        assertEquals(testProduct.getId(), 0);
//
//        productRepository.save(testProduct);
//        assertEquals(testProduct.getId(), "12345");
//    }
//
//    @Test
//    @Description("Should retrieve the Product we just saved")
//    public void fetchProduct() {
//
//        assertNotNull(fetchedProduct);
//    }
//
//    @Test
//    @Description("Should prove Product and fetchedProduct are the same")
//    public void productAndFetchedProductAreTheSame() {
//        assertEquals(testProduct.getId(), fetchedProduct.getId());
//        assertEquals(testProduct.getDescription(), fetchedProduct.getDescription());
//    }
//
//    @Test
//    @Description("Should update and save the Product")
//    public void updateAndSave() {
//        fetchedProduct.setDescription("New Description");
//        productRepository.save(fetchedProduct);
//    }
//
//    @Test
//    @Description("Should retrieve the updated fetchedProduct")
//    public void retrieveUpdatedProduct() {
//        Product updatedFetchedProduct = productRepository.findOne(fetchedProduct.getId());
//
//        assertEquals(fetchedProduct.getDescription(), updatedFetchedProduct.getDescription());
//    }
//
//    @Test
//    @Description("Should verify there is one product in DB")
//    public void howManyObjsInDb() {
//        long productCount = productRepository.count();
//        assertEquals(productCount, 1);
//    }
//
//    @Test
//    @Description("Should get all objs in DB, and count one")
//    public void getAllAndCount() {
//        Iterable<Product> products = productRepository.findAll();
//
//        int count = 0;
//
//        for (Product p : products) {
//            count++;
//        }
//
//        assertEquals(count, 1);
//    }
//}
