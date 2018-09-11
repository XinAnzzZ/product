package com.alibaba.xinan.repository;

import com.alibaba.xinan.entity.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 11:41
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo, String> {

    /**
     * 查询在架商品列表
     *
     * @param status the status
     * @return the list
     */
    List<ProductInfo> findByProductStatus(Integer status);

    /**
     * find by product id list
     *
     * @param productIdList the id list
     * @return the product list
     */
    List<ProductInfo> findByProductIdIn(List<String> productIdList);
}
