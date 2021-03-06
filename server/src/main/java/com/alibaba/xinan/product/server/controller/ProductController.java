package com.alibaba.xinan.product.server.controller;

import com.alibaba.xinan.product.common.DecreaseStockInput;
import com.alibaba.xinan.product.server.entity.ProductCategory;
import com.alibaba.xinan.product.server.entity.ProductInfo;
import com.alibaba.xinan.product.server.entity.vo.ProductInfoVO;
import com.alibaba.xinan.product.server.entity.vo.ProductVO;
import com.alibaba.xinan.product.server.entity.vo.ResultVO;
import com.alibaba.xinan.product.server.service.CategoryService;
import com.alibaba.xinan.product.server.service.ProductService;
import com.alibaba.xinan.product.server.util.ResultUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author XinAnzzZ
 * @date 2018/8/29 10:53
 */
@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    /**
     * 1. 查询所有在架的商品
     * 2. 获取类目type列表
     * 3. 从数据库查询类目
     * 4. 构造数据
     */
    @GetMapping("/list")
    public ResultVO list() {
        // 1. 查询所有在架的商品
        List<ProductInfo> productInfoList = productService.findAll();

        // 2. 获取类目type列表
        List<Integer> categoryTypeList = productInfoList.stream()
                .map(ProductInfo::getCategoryType).collect(Collectors.toList());

        // 3. 从数据库查询类目
        List<ProductCategory> productCategoryList = categoryService.findByCategoryTypeIn(categoryTypeList);

        // 4. 构造数据
        List<ProductVO> productVOList = new ArrayList<>();
        productCategoryList.forEach(productCategory -> {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryName(productCategory.getCategoryName());
            productVO.setCategoryType(productCategory.getCategoryType());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            productInfoList.forEach(productInfo -> {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();
                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            });

            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        });
        return ResultUtils.success(productVOList);
    }

    /**
     * 获取商品列表 （给订单服务提供）
     */
    @PostMapping("/listForOrder")
    public List<ProductInfo> listForOrder(@RequestBody List<String> productIdList) {
        return productService.findList(productIdList);
    }

    @PostMapping("/decrease/stock")
    public void decreaseStock(@RequestBody List<DecreaseStockInput> cartDTOList) {
        productService.decreaseStock(cartDTOList);
    }
}
