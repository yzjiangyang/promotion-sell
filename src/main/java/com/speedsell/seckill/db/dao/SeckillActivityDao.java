package com.speedsell.seckill.db.dao;

import com.speedsell.seckill.db.po.SeckillActivity;

import java.util.List;

public interface SeckillActivityDao {

    List<SeckillActivity> querySeckillActivitysByStatus(int activityStatus);

    void inertSeckillActivity(SeckillActivity seckillActivity);

    SeckillActivity querySeckillActivityById(long activityId);

    void updateSeckillActivity(SeckillActivity seckillActivity);
}
