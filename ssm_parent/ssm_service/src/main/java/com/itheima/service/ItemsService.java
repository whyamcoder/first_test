package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

public interface ItemsService {

    /***
     * 列表查询
     * @return
     */
    List<Items> list();

    /***
     * 增加商品
     * @param items
     * @return
     */
    int save(Items items);

    List<Items> findAll();
}
