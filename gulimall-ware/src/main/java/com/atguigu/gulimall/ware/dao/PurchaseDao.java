package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.PurchaseEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 采购信息
 * 
 * @author tiankong
 * @email tiankong@gmail.com
 * @date 2021-06-12 13:49:28
 */
@Mapper
public interface PurchaseDao extends BaseMapper<PurchaseEntity> {
	
}
