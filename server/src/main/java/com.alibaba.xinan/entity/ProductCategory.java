package com.alibaba.xinan.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 11:47
 */
@Data
@Entity
public class ProductCategory implements Serializable {

    private static final long serialVersionUID = 2422179162007133719L;

    @Id
    @GeneratedValue
    private Integer categoryId;

    /*** 类目名字 */
    private String categoryName;

    /*** 类目编号 */
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;
}
