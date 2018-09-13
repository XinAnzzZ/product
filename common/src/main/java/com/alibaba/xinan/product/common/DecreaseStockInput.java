package com.alibaba.xinan.product.common;

import lombok.Data;

/**
 * 减库存 入参
 *
 * @author XinAnzzZ
 * @date 2018/9/12 15:36
 */
@Data
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}