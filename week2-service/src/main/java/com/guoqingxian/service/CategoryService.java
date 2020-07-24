package com.guoqingxian.service;

import com.guoqingxian.model.Category;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

public interface CategoryService extends IService<Category>{
    /**
     * @return 博文分类列表
     */
    List<Category> getList();

}
