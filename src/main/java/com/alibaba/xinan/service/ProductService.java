package com.alibaba.xinan.service;

import com.alibaba.xinan.entity.ProductInfo;

import java.util.List;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 11:55
 */
public interface ProductService {

    /**
     * 查询所有
     * @return the list
     */
    List<ProductInfo> findAll();
}
