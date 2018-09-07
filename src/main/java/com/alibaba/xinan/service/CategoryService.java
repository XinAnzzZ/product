package com.alibaba.xinan.service;

import com.alibaba.xinan.entity.ProductCategory;

import java.util.List;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 12:52
 */
public interface CategoryService {

    /**
     * 通过类目 type 查询列表
     *
     * @param categoryTypeList the type list
     * @return the ProductCategory list
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
