package com.alibaba.xinan.product.client;

import com.alibaba.xinan.product.common.DecreaseStockInput;
import com.alibaba.xinan.product.common.ProductInfoOutput;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

/**
 * @author XinAnzzZ
 * @date 2018/9/13 14:22
 */
@FeignClient
public interface ProductClient {

    /**
     * 获取商品列表
     *
     * @param productIdList 商品id
     * @return the list
     */
    @PostMapping("/product/listForOrder")
    List<ProductInfoOutput> listForOrder(@RequestBody List<String> productIdList);

    /**
     * 减库存
     *
     * @param decreaseStockInputList 减库存对象
     */
    @PostMapping("/product/decreaseStock")
    void decreaseStock(@RequestBody List<DecreaseStockInput> decreaseStockInputList);
}
