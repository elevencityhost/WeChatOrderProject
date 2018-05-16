package com.eric.sell.service.impl;

import com.eric.sell.dao.ProductCategoryRepository;
import com.eric.sell.model.ProductCategory;
import com.eric.sell.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/16 22:42
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Autowired
    private ProductCategoryRepository repository;

    @Override
    public ProductCategory findById(Integer id) {
        return repository.findById(id).get();
    }

    @Override
    public ProductCategory saveProductCategory(ProductCategory productCategory) {
        productCategory.setCategoryId(1);
        productCategory.setCategoryName("男生专享");
        productCategory.setCategoryType(10);
        return repository.save(productCategory);
    }

    @Override
    public List<ProductCategory> findAll() {
        return repository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        id = 3;
        repository.deleteById(id);
    }
}
