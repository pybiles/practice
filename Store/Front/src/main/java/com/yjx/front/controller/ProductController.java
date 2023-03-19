package com.yjx.front.controller;


import com.yjx.dal.entity.Product;
import com.yjx.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 商品表 前端控制器
 * </p>
 *
 * @author yjx
 * @since 2023-03-18 06:59:29
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @RequestMapping("/topN")
    public List<Product> topN(Integer n){
        return productService.topN(n);
    }

}

