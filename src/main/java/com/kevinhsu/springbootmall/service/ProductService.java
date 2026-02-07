package com.kevinhsu.springbootmall.service;

import com.kevinhsu.springbootmall.dto.ProductRequest;
import com.kevinhsu.springbootmall.model.Product;

public interface ProductService {

    Product getProductById(Integer productId);

    Integer createProduct(ProductRequest productRequest);
}
