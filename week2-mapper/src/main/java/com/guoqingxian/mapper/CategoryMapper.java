package com.guoqingxian.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.guoqingxian.model.Category;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CategoryMapper extends BaseMapper<Category> {
    /**
     * @return 博文分类列表
     */
    List<Category> getList();
}