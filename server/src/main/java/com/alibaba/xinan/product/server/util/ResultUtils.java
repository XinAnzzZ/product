package com.alibaba.xinan.product.server.util;

import com.alibaba.xinan.product.server.entity.vo.ResultVO;
import lombok.Data;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 13:39
 */
@Data
public class ResultUtils {

    public static ResultVO success(Object data) {
        ResultVO vo = new ResultVO();
        vo.setCode(200);
        vo.setMsg("success");
        vo.setData(data);
        return vo;
    }
}
