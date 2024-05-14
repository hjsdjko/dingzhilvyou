package com.entity.model;

import com.entity.LvyouluxianOrderEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 旅游路线订单
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LvyouluxianOrderModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 订单号
     */
    private String lvyouluxianOrderUuidNumber;


    /**
     * 旅游路线
     */
    private Integer lvyouluxianId;


    /**
     * 用户
     */
    private Integer yonghuId;


    /**
     * 购买数量
     */
    private Integer buyNumber;


    /**
     * 实付价格
     */
    private Double lvyouluxianOrderTruePrice;


    /**
     * 订单类型
     */
    private Integer lvyouluxianOrderTypes;


    /**
     * 支付类型
     */
    private Integer lvyouluxianOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：订单号
	 */
    public String getLvyouluxianOrderUuidNumber() {
        return lvyouluxianOrderUuidNumber;
    }


    /**
	 * 设置：订单号
	 */
    public void setLvyouluxianOrderUuidNumber(String lvyouluxianOrderUuidNumber) {
        this.lvyouluxianOrderUuidNumber = lvyouluxianOrderUuidNumber;
    }
    /**
	 * 获取：旅游路线
	 */
    public Integer getLvyouluxianId() {
        return lvyouluxianId;
    }


    /**
	 * 设置：旅游路线
	 */
    public void setLvyouluxianId(Integer lvyouluxianId) {
        this.lvyouluxianId = lvyouluxianId;
    }
    /**
	 * 获取：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 设置：用户
	 */
    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 获取：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 设置：购买数量
	 */
    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 获取：实付价格
	 */
    public Double getLvyouluxianOrderTruePrice() {
        return lvyouluxianOrderTruePrice;
    }


    /**
	 * 设置：实付价格
	 */
    public void setLvyouluxianOrderTruePrice(Double lvyouluxianOrderTruePrice) {
        this.lvyouluxianOrderTruePrice = lvyouluxianOrderTruePrice;
    }
    /**
	 * 获取：订单类型
	 */
    public Integer getLvyouluxianOrderTypes() {
        return lvyouluxianOrderTypes;
    }


    /**
	 * 设置：订单类型
	 */
    public void setLvyouluxianOrderTypes(Integer lvyouluxianOrderTypes) {
        this.lvyouluxianOrderTypes = lvyouluxianOrderTypes;
    }
    /**
	 * 获取：支付类型
	 */
    public Integer getLvyouluxianOrderPaymentTypes() {
        return lvyouluxianOrderPaymentTypes;
    }


    /**
	 * 设置：支付类型
	 */
    public void setLvyouluxianOrderPaymentTypes(Integer lvyouluxianOrderPaymentTypes) {
        this.lvyouluxianOrderPaymentTypes = lvyouluxianOrderPaymentTypes;
    }
    /**
	 * 获取：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：订单创建时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
