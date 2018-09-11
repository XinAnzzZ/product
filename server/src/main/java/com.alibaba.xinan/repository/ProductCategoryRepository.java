package com.alibaba.xinan.repository;

import com.alibaba.xinan.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 11:49
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer> {

    /**
     * 通过类目 type 查询列表
     *
     * @param categoryTypeList the type list
     * @return the ProductCategory list
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
