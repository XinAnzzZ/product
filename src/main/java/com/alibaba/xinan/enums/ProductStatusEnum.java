package com.alibaba.xinan.enums;

import lombok.Getter;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 11:59
 */
@Getter
public enum ProductStatusEnum {

    /*** 下架 */
    UP(0, "下架"),

    /*** 在架 */
    DOWN(1, "在架");

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
