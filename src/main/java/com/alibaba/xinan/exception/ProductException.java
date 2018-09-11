package com.alibaba.xinan.exception;

import com.alibaba.xinan.enums.ResultEnum;

/**
 * @author XinAnzzZ
 * @date 2018/9/11 10:17
 */
public class ProductException extends RuntimeException {

    private static final long serialVersionUID = -2799443430286345916L;

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }
}
