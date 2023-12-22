package com.canteen.bean;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table Dish
 *
 * @mbg.generated do_not_delete_during_merge
 */
public class Dish implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Dish.DishID
     *
     * @mbg.generated
     */
    private Integer dishid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Dish.DishName
     *
     * @mbg.generated
     */
    private String dishname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Dish.Price
     *
     * @mbg.generated
     */
    private BigDecimal price;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Dish.PromotePrice
     *
     * @mbg.generated
     */
    private BigDecimal promoteprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Dish.DishStyle
     *
     * @mbg.generated
     */
    private String dishstyle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Dish.CanteenID
     *
     * @mbg.generated
     */
    private Integer canteenid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Dish.Description
     *
     * @mbg.generated
     */
    private String description;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Dish.ImageFileName
     *
     * @mbg.generated
     */
    private String imagefilename;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Dish.IfRecommend
     *
     * @mbg.generated
     */
    private Boolean ifrecommend;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table Dish
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Dish.DishID
     *
     * @return the value of Dish.DishID
     *
     * @mbg.generated
     */
    public Integer getDishid() {
        return dishid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Dish.DishID
     *
     * @param dishid the value for Dish.DishID
     *
     * @mbg.generated
     */
    public void setDishid(Integer dishid) {
        this.dishid = dishid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Dish.DishName
     *
     * @return the value of Dish.DishName
     *
     * @mbg.generated
     */
    public String getDishname() {
        return dishname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Dish.DishName
     *
     * @param dishname the value for Dish.DishName
     *
     * @mbg.generated
     */
    public void setDishname(String dishname) {
        this.dishname = dishname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Dish.Price
     *
     * @return the value of Dish.Price
     *
     * @mbg.generated
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Dish.Price
     *
     * @param price the value for Dish.Price
     *
     * @mbg.generated
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Dish.PromotePrice
     *
     * @return the value of Dish.PromotePrice
     *
     * @mbg.generated
     */
    public BigDecimal getPromoteprice() {
        return promoteprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Dish.PromotePrice
     *
     * @param promoteprice the value for Dish.PromotePrice
     *
     * @mbg.generated
     */
    public void setPromoteprice(BigDecimal promoteprice) {
        this.promoteprice = promoteprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Dish.DishStyle
     *
     * @return the value of Dish.DishStyle
     *
     * @mbg.generated
     */
    public String getDishstyle() {
        return dishstyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Dish.DishStyle
     *
     * @param dishstyle the value for Dish.DishStyle
     *
     * @mbg.generated
     */
    public void setDishstyle(String dishstyle) {
        this.dishstyle = dishstyle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Dish.CanteenID
     *
     * @return the value of Dish.CanteenID
     *
     * @mbg.generated
     */
    public Integer getCanteenid() {
        return canteenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Dish.CanteenID
     *
     * @param canteenid the value for Dish.CanteenID
     *
     * @mbg.generated
     */
    public void setCanteenid(Integer canteenid) {
        this.canteenid = canteenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Dish.Description
     *
     * @return the value of Dish.Description
     *
     * @mbg.generated
     */
    public String getDescription() {
        return description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Dish.Description
     *
     * @param description the value for Dish.Description
     *
     * @mbg.generated
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Dish.ImageFileName
     *
     * @return the value of Dish.ImageFileName
     *
     * @mbg.generated
     */
    public String getImagefilename() {
        return imagefilename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Dish.ImageFileName
     *
     * @param imagefilename the value for Dish.ImageFileName
     *
     * @mbg.generated
     */
    public void setImagefilename(String imagefilename) {
        this.imagefilename = imagefilename;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Dish.IfRecommend
     *
     * @return the value of Dish.IfRecommend
     *
     * @mbg.generated
     */
    public Boolean getIfrecommend() {
        return ifrecommend;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Dish.IfRecommend
     *
     * @param ifrecommend the value for Dish.IfRecommend
     *
     * @mbg.generated
     */
    public void setIfrecommend(Boolean ifrecommend) {
        this.ifrecommend = ifrecommend;
    }
}