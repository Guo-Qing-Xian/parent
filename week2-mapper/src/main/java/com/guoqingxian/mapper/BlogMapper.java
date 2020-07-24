package com.guoqingxian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guoqingxian.model.Blog;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BlogMapper extends BaseMapper<Blog> {
}