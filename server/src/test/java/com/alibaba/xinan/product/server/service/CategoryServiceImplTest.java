package com.alibaba.xinan.product.server.service;

import com.alibaba.xinan.ProductApplicationTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 12:58
 */
@Component
public class CategoryServiceImplTest extends ProductApplicationTests {

    @Autowired
    private CategoryService categoryService;

    @Test
    public void findByCategoryTypeIn() {
        System.out.println(categoryService.findByCategoryTypeIn(Arrays.asList(11, 22)));
    }
}