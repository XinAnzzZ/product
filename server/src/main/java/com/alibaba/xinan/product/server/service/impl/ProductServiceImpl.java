package com.alibaba.xinan.product.server.service.impl;

import com.alibaba.xinan.product.common.DecreaseStockInput;
import com.alibaba.xinan.product.server.entity.ProductInfo;
import com.alibaba.xinan.product.server.enums.ProductStatusEnum;
import com.alibaba.xinan.product.server.enums.ResultEnum;
import com.alibaba.xinan.product.server.exception.ProductException;
import com.alibaba.xinan.product.server.repository.ProductInfoRepository;
import com.alibaba.xinan.product.server.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

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

    @Override
    public List<ProductInfo> findList(List<String> productIdList) {
        return productInfoRepository.findByProductIdIn(productIdList);
    }

    @Override
    @Transactional(rollbackFor = RuntimeException.class)
    public void decreaseStock(List<DecreaseStockInput> decreaseStockInputList) {
        decreaseStockInputList.forEach(decreaseStockInput -> {
            // 判断商品是否存在
            Optional<ProductInfo> productInfoOptional = productInfoRepository.findById(decreaseStockInput.getProductId());
            if (!productInfoOptional.isPresent()) {
                throw new ProductException(ResultEnum.PRODUCT_NOT_EXIST);
            }

            // 判断库存是否足够
            ProductInfo productInfo = productInfoOptional.get();
            int result = productInfo.getProductStock() - decreaseStockInput.getProductQuantity();
            if (result < 0) {
                throw new ProductException(ResultEnum.PRODUCT_STOCK_ERROR);
            }

            // 减库存
            productInfo.setProductStock(result);
            productInfoRepository.save(productInfo);
        });
    }
}
