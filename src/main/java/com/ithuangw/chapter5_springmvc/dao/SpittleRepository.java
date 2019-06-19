package com.ithuangw.chapter5_springmvc.dao;

import com.ithuangw.chapter5_springmvc.entity.Spittle;

import java.util.List;

/**
 * @author Huangw
 * @projectName springInAction
 * @description: TODO
 * @date 2019/6/13 13:36
 */
public interface SpittleRepository {

    List<Spittle> findSpittles(long max, long count);
}
