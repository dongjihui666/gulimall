package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.SpuCommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author tiankong
 * @email tiankong@gmail.com
 * @date 2021-06-11 20:43:40
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
