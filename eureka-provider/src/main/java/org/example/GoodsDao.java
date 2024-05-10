package org.example;

import org.springframework.stereotype.Repository;

@Repository
public class GoodsDao {

    public static Goods findOne(int id){
        Goods phone = new Goods(1, "华为P10", 6999.00, 20);
        return phone;
    }
}
