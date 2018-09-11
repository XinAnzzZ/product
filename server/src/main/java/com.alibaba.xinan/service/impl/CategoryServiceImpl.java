package com.alibaba.xinan.service.impl;

import com.alibaba.xinan.entity.ProductCategory;
import com.alibaba.xinan.repository.ProductCategoryRepository;
import com.alibaba.xinan.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 12:53
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
