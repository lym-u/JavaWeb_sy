package com.canteen.dao;

import com.canteen.bean.Dishreview;
import com.canteen.bean.DishreviewExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DishreviewMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    long countByExample(DishreviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    int deleteByExample(DishreviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer dishreviewid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    int insert(Dishreview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    int insertSelective(Dishreview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    List<Dishreview> selectByExampleWithBLOBs(DishreviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    List<Dishreview> selectByExample(DishreviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    Dishreview selectByPrimaryKey(Integer dishreviewid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") Dishreview record, @Param("example") DishreviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    int updateByExampleWithBLOBs(@Param("record") Dishreview record, @Param("example") DishreviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") Dishreview record, @Param("example") DishreviewExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(Dishreview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    int updateByPrimaryKeyWithBLOBs(Dishreview record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table DishReview
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(Dishreview record);
}