package com.guoqingxian.service.impl;

import com.guoqingxian.service.BlogService;
import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.guoqingxian.mapper.BlogMapper;
import com.guoqingxian.model.Blog;

import javax.annotation.Resource;

@Service
public class BlogServiceImpl extends ServiceImpl<BlogMapper, Blog> implements BlogService {

    @Resource
    private BlogMapper blogMapper;

}
