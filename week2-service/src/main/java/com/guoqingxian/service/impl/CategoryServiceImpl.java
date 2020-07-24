package com.guoqingxian.service.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guoqingxian.model.Category;
import com.guoqingxian.mapper.CategoryMapper;
import com.guoqingxian.service.CategoryService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService{
    @Resource
    private CategoryMapper categoryMapper;

    @Override
    public List<Category> getList() {
        return categoryMapper.getList();
    }
}
