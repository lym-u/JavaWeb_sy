//package com.canteen.service.impl;
//
//import com.canteen.bean.Dishes;
//import com.canteen.bean.TStudent;
//import com.canteen.dao.DishMapper;
//import com.canteen.dao.TStudentMapper;
//import com.canteen.service.DishService;
//import com.github.pagehelper.PageHelper;
//import com.github.pagehelper.PageInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service // 标识为服务类
//public class DishServiceImpl implements DishService {
//    @Autowired
//    private DishMapper dishMapper;
//
//    /**
//     *全量查询菜品
//     * @return
//     */
//    @Override
//    public PageInfo<Dishes> getAllDish(Dishes dishes, int page, int size) {
//        // 首先开启PageHelper的分页
//        PageHelper.startPage(page, size);
//        // 查询分页信息 调用方式与普通方式一致
//        List<Dishes> list = dishMapper.getAllDish(dishes);
//        //生成PageInfo对象
//        PageInfo<Dishes> pageInfo=new PageInfo<Dishes>(list);
//        return pageInfo;
//    }
//
//    /**
//     *查询是否存在
//     * @return
//     */
//    @Override
//    public List<Dishes> serchDish() {
//
//    }
//
//    /**
//     * 增加菜品信息
//     * @param dish
//     * @return
//     */
//    @Override
//    public Integer addDish(Dishes dish) {
//        Integer total=studentMapper.insert(student);
//        return total;
//    }
//
//    /**
//     * 删除菜品信息
//     * @param dish
//     * @return
//     */
//    @Override
//    public Integer deleteDish(int dishID) {
//
//    }
//
//    /**
//     * 修改菜品信息
//     * @param dish
//     * @return
//     */
//    @Override
//    public Integer updateDish(Dishes dish) {
//
//    }
//}
