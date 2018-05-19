package com.eric.sell.controller;

import com.eric.sell.vo.ProductInfoVO;
import com.eric.sell.vo.ProductVO;
import com.eric.sell.vo.ResultVO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Arrays;

/**
 * function
 *
 * @author 十一城城主
 * @data 2018/5/19 23:12
 */
@RestController
@RequestMapping("/buyer/product")
public class BuyerProductController {
    @GetMapping("/list")
    public ResultVO list() {
        ProductInfoVO productInfoVO = new ProductInfoVO();
        productInfoVO.setProductId("123");
        productInfoVO.setProductName("酸辣粉");
        productInfoVO.setProductPrice(new BigDecimal(5.3));
        productInfoVO.setProductDescription("好吃不贵");
        productInfoVO.setProductIcon("https://xxxxxxx.jpg");
        ProductVO productVO = new ProductVO();
        productVO.setCategoryName("热销");
        productVO.setCategoryType(10);
        productVO.setProductInfoVOList(Arrays.asList(productInfoVO));
        ResultVO<ProductVO> resultVO = new ResultVO<ProductVO>();
        resultVO.setCode(0);
        resultVO.setMsg("查询成功");
        resultVO.setData(Arrays.asList(productVO));
        return resultVO;
    }

}
