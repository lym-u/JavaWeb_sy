package com.canteen.service;


import com.canteen.bean.Dishes;
import com.canteen.bean.TStudent;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface DishService {
    /**
     *全量查询菜品
     * @return
     */
    PageInfo<Dishes> getAllDish(Dishes dishes, int page, int limit);

    /**
     *查询是否存在
     * @return
     */
    List<Dishes> serchDish();

    /**
     * 增加菜品信息
     * @param dish
     * @return
     */
    Integer addDish(Dishes dish);

    /**
     * 删除菜品信息
     * @param dish
     * @return
     */
    Integer deleteDish(int dishID);

    /**
     * 修改菜品信息
     * @param dish
     * @return
     */
    Integer updateDish(Dishes dish);
}
