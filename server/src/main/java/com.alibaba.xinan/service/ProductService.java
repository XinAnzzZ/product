package com.alibaba.xinan.service;

import com.alibaba.xinan.entity.ProductInfo;
import com.alibaba.xinan.entity.dto.CartDTO;

import java.util.List;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 11:55
 */
public interface ProductService {

    /**
     * 查询所有
     *
     * @return the list
     */
    List<ProductInfo> findAll();

    /**
     * 查询商品列表
     *
     * @param productIdList the id list
     * @return the product list
     */
    List<ProductInfo> findList(List<String> productIdList);

    /**
     * 减库存
     *
     * @param cartDTOList cart dto list
     */
    void decreaseStock(List<CartDTO> cartDTOList);
}
