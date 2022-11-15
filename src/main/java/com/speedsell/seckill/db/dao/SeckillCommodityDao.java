package com.speedsell.seckill.db.dao;

import com.speedsell.seckill.db.po.SeckillCommodity;

public interface SeckillCommodityDao {
    SeckillCommodity querySeckillCommodityById(long commodityId);
}