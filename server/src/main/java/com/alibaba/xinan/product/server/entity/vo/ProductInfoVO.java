package com.alibaba.xinan.product.server.entity.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 13:11
 */
@Data
public class ProductInfoVO implements Serializable {

    private static final long serialVersionUID = -9048505959322600061L;

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;
}
