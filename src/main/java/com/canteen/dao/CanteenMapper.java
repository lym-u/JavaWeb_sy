package com.canteen.dao;

<<<<<<< HEAD
=======
import com.canteen.bean.Canteen;
>>>>>>> origin/branch1
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 食堂数据层
 * @author
 *
 */
@Mapper //标识为mybatis数据层接口
public interface CanteenMapper {
	/**
	 * 全量查询
	 * @param canteen
	 * @return
	 */
	List<Canteen> getCanteen(Canteen canteen);

}
