package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author tiankong
 * @email tiankong@gmail.com
 * @date 2021-06-11 20:43:41
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
