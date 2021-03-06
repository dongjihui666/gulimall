package com.atguigu.gulimall.ware.dao;

import com.atguigu.gulimall.ware.entity.WareInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 仓库信息
 * 
 * @author tiankong
 * @email tiankong@gmail.com
 * @date 2021-06-12 13:49:28
 */
@Mapper
public interface WareInfoDao extends BaseMapper<WareInfoEntity> {
	
}
