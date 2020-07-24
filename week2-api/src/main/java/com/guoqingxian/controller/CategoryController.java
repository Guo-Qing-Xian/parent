/**
 * 作者:   郭青贤
 * 时间:   2020/7/23 19:30
 */
package com.guoqingxian.controller;

import com.guoqingxian.model.Category;
import com.guoqingxian.service.CategoryService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@CrossOrigin
public class CategoryController {

    @Resource
    private CategoryService categoryService;
    @RequestMapping("/blog")
    public List<Category> getList(){
        List<Category> list = categoryService.getList();
        return list;
    }
}
