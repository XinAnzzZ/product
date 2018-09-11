package com.alibaba.xinan.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author XinAnzzZ
 * @date 2018/9/11 10:10
 */
@Data
public class CartDTO implements Serializable {

    private static final long serialVersionUID = -8246972646719811549L;

    private String productId;

    private Integer productQuantity;

    public CartDTO() {
    }

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }
}
