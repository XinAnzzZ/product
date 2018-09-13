package com.alibaba.xinan.product.server.entity.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 13:09
 */
@Data
public class ProductVO implements Serializable {

    private static final long serialVersionUID = -3994684706214376347L;

    @JsonProperty("name")
    private String categoryName;

    @JsonProperty("type")
    private Integer categoryType;

    @JsonProperty("foods")
    List<ProductInfoVO> productInfoVOList;
}
