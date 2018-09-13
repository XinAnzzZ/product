package com.alibaba.xinan.product.server.enums;

import lombok.Getter;

/**
 * @author XinAnzzZ
 * @date 2018/9/11 10:19
 */
@Getter
public enum ResultEnum {

    /*** 商品不存在 */
    PRODUCT_NOT_EXIST(1, "商品不存在"),

    /*** 库存有误 */
    PRODUCT_STOCK_ERROR(1, "库存有误"),
    ;

    private Integer code;

    private String msg;

    ResultEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
