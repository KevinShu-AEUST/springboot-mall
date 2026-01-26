package com.kevinhsu.springbootmall.dao;

import com.kevinhsu.springbootmall.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
