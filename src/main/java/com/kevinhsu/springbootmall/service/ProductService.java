package com.kevinhsu.springbootmall.service;

import com.kevinhsu.springbootmall.constant.ProductCategory;
import com.kevinhsu.springbootmall.dto.ProductRequest;
import com.kevinhsu.springbootmall.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getProducts(ProductCategory category,String search);

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);

    void updateProduct(Integer productId, ProductRequest productRequest);

    void deleteProductById(Integer productId);
}
