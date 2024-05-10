package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {

    @Autowired
    private GoodsDao goodsDao;

    public Goods findOne(int id){
        return goodsDao.findOne(id);
    }
}
