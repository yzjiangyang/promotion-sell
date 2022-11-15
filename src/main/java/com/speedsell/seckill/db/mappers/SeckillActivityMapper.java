package com.speedsell.seckill.db.mappers;

import com.speedsell.seckill.db.po.SeckillActivity;

import java.util.List;

public interface SeckillActivityMapper {
    List<SeckillActivity> querySeckillActivitysByStatus(int activityStatus);

    int deleteByPrimaryKey(Long id);

    int insert(SeckillActivity record);

    int insertSelective(SeckillActivity record);

    SeckillActivity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SeckillActivity record);

    int updateByPrimaryKey(SeckillActivity record);
}