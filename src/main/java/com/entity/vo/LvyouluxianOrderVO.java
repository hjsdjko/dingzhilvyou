package com.entity.vo;

import com.entity.LvyouluxianOrderEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 旅游路线订单
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("lvyouluxian_order")
public class LvyouluxianOrderVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 订单号
     */

    @TableField(value = "lvyouluxian_order_uuid_number")
    private String lvyouluxianOrderUuidNumber;


    /**
     * 旅游路线
     */

    @TableField(value = "lvyouluxian_id")
    private Integer lvyouluxianId;


    /**
     * 用户
     */

    @TableField(value = "yonghu_id")
    private Integer yonghuId;


    /**
     * 购买数量
     */

    @TableField(value = "buy_number")
    private Integer buyNumber;


    /**
     * 实付价格
     */

    @TableField(value = "lvyouluxian_order_true_price")
    private Double lvyouluxianOrderTruePrice;


    /**
     * 订单类型
     */

    @TableField(value = "lvyouluxian_order_types")
    private Integer lvyouluxianOrderTypes;


    /**
     * 支付类型
     */

    @TableField(value = "lvyouluxian_order_payment_types")
    private Integer lvyouluxianOrderPaymentTypes;


    /**
     * 订单创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间 show3
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：订单号
	 */
    public String getLvyouluxianOrderUuidNumber() {
        return lvyouluxianOrderUuidNumber;
    }


    /**
	 * 获取：订单号
	 */

    public void setLvyouluxianOrderUuidNumber(String lvyouluxianOrderUuidNumber) {
        this.lvyouluxianOrderUuidNumber = lvyouluxianOrderUuidNumber;
    }
    /**
	 * 设置：旅游路线
	 */
    public Integer getLvyouluxianId() {
        return lvyouluxianId;
    }


    /**
	 * 获取：旅游路线
	 */

    public void setLvyouluxianId(Integer lvyouluxianId) {
        this.lvyouluxianId = lvyouluxianId;
    }
    /**
	 * 设置：用户
	 */
    public Integer getYonghuId() {
        return yonghuId;
    }


    /**
	 * 获取：用户
	 */

    public void setYonghuId(Integer yonghuId) {
        this.yonghuId = yonghuId;
    }
    /**
	 * 设置：购买数量
	 */
    public Integer getBuyNumber() {
        return buyNumber;
    }


    /**
	 * 获取：购买数量
	 */

    public void setBuyNumber(Integer buyNumber) {
        this.buyNumber = buyNumber;
    }
    /**
	 * 设置：实付价格
	 */
    public Double getLvyouluxianOrderTruePrice() {
        return lvyouluxianOrderTruePrice;
    }


    /**
	 * 获取：实付价格
	 */

    public void setLvyouluxianOrderTruePrice(Double lvyouluxianOrderTruePrice) {
        this.lvyouluxianOrderTruePrice = lvyouluxianOrderTruePrice;
    }
    /**
	 * 设置：订单类型
	 */
    public Integer getLvyouluxianOrderTypes() {
        return lvyouluxianOrderTypes;
    }


    /**
	 * 获取：订单类型
	 */

    public void setLvyouluxianOrderTypes(Integer lvyouluxianOrderTypes) {
        this.lvyouluxianOrderTypes = lvyouluxianOrderTypes;
    }
    /**
	 * 设置：支付类型
	 */
    public Integer getLvyouluxianOrderPaymentTypes() {
        return lvyouluxianOrderPaymentTypes;
    }


    /**
	 * 获取：支付类型
	 */

    public void setLvyouluxianOrderPaymentTypes(Integer lvyouluxianOrderPaymentTypes) {
        this.lvyouluxianOrderPaymentTypes = lvyouluxianOrderPaymentTypes;
    }
    /**
	 * 设置：订单创建时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：订单创建时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间 show3
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
