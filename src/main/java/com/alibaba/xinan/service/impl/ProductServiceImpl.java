package com.alibaba.xinan.service.impl;

import com.alibaba.xinan.entity.ProductInfo;
import com.alibaba.xinan.enums.ProductStatusEnum;
import com.alibaba.xinan.repository.ProductInfoRepository;
import com.alibaba.xinan.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 11:57
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductInfoRepository productInfoRepository;

    @Override
    public List<ProductInfo> findAll() {
        return productInfoRepository.findByProductStatus(ProductStatusEnum.UP.getCode());
    }
}
