package com.entity.vo;

import com.entity.LvyouluxianEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 旅游路线
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("lvyouluxian")
public class LvyouluxianVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 旅游路线名称
     */

    @TableField(value = "lvyouluxian_name")
    private String lvyouluxianName;


    /**
     * 旅游路线照片
     */

    @TableField(value = "lvyouluxian_photo")
    private String lvyouluxianPhoto;


    /**
     * 旅游时间
     */

    @TableField(value = "lvyouluxian_shijian")
    private String lvyouluxianShijian;


    /**
     * 行程安排
     */

    @TableField(value = "lvyouluxian_xingcheng")
    private String lvyouluxianXingcheng;


    /**
     * 旅游路线类型
     */

    @TableField(value = "lvyouluxian_types")
    private Integer lvyouluxianTypes;


    /**
     * 剩余参与人数
     */

    @TableField(value = "lvyouluxian_kucun_number")
    private Integer lvyouluxianKucunNumber;


    /**
     * 旅游路线原价
     */

    @TableField(value = "lvyouluxian_old_money")
    private Double lvyouluxianOldMoney;


    /**
     * 现价
     */

    @TableField(value = "lvyouluxian_new_money")
    private Double lvyouluxianNewMoney;


    /**
     * 点击次数
     */

    @TableField(value = "lvyouluxian_clicknum")
    private Integer lvyouluxianClicknum;


    /**
     * 是否上架
     */

    @TableField(value = "shangxia_types")
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */

    @TableField(value = "lvyouluxian_delete")
    private Integer lvyouluxianDelete;


    /**
     * 旅游路线介绍
     */

    @TableField(value = "lvyouluxian_content")
    private String lvyouluxianContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 设置：旅游路线名称
	 */
    public String getLvyouluxianName() {
        return lvyouluxianName;
    }


    /**
	 * 获取：旅游路线名称
	 */

    public void setLvyouluxianName(String lvyouluxianName) {
        this.lvyouluxianName = lvyouluxianName;
    }
    /**
	 * 设置：旅游路线照片
	 */
    public String getLvyouluxianPhoto() {
        return lvyouluxianPhoto;
    }


    /**
	 * 获取：旅游路线照片
	 */

    public void setLvyouluxianPhoto(String lvyouluxianPhoto) {
        this.lvyouluxianPhoto = lvyouluxianPhoto;
    }
    /**
	 * 设置：旅游时间
	 */
    public String getLvyouluxianShijian() {
        return lvyouluxianShijian;
    }


    /**
	 * 获取：旅游时间
	 */

    public void setLvyouluxianShijian(String lvyouluxianShijian) {
        this.lvyouluxianShijian = lvyouluxianShijian;
    }
    /**
	 * 设置：行程安排
	 */
    public String getLvyouluxianXingcheng() {
        return lvyouluxianXingcheng;
    }


    /**
	 * 获取：行程安排
	 */

    public void setLvyouluxianXingcheng(String lvyouluxianXingcheng) {
        this.lvyouluxianXingcheng = lvyouluxianXingcheng;
    }
    /**
	 * 设置：旅游路线类型
	 */
    public Integer getLvyouluxianTypes() {
        return lvyouluxianTypes;
    }


    /**
	 * 获取：旅游路线类型
	 */

    public void setLvyouluxianTypes(Integer lvyouluxianTypes) {
        this.lvyouluxianTypes = lvyouluxianTypes;
    }
    /**
	 * 设置：剩余参与人数
	 */
    public Integer getLvyouluxianKucunNumber() {
        return lvyouluxianKucunNumber;
    }


    /**
	 * 获取：剩余参与人数
	 */

    public void setLvyouluxianKucunNumber(Integer lvyouluxianKucunNumber) {
        this.lvyouluxianKucunNumber = lvyouluxianKucunNumber;
    }
    /**
	 * 设置：旅游路线原价
	 */
    public Double getLvyouluxianOldMoney() {
        return lvyouluxianOldMoney;
    }


    /**
	 * 获取：旅游路线原价
	 */

    public void setLvyouluxianOldMoney(Double lvyouluxianOldMoney) {
        this.lvyouluxianOldMoney = lvyouluxianOldMoney;
    }
    /**
	 * 设置：现价
	 */
    public Double getLvyouluxianNewMoney() {
        return lvyouluxianNewMoney;
    }


    /**
	 * 获取：现价
	 */

    public void setLvyouluxianNewMoney(Double lvyouluxianNewMoney) {
        this.lvyouluxianNewMoney = lvyouluxianNewMoney;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getLvyouluxianClicknum() {
        return lvyouluxianClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setLvyouluxianClicknum(Integer lvyouluxianClicknum) {
        this.lvyouluxianClicknum = lvyouluxianClicknum;
    }
    /**
	 * 设置：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 获取：是否上架
	 */

    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getLvyouluxianDelete() {
        return lvyouluxianDelete;
    }


    /**
	 * 获取：逻辑删除
	 */

    public void setLvyouluxianDelete(Integer lvyouluxianDelete) {
        this.lvyouluxianDelete = lvyouluxianDelete;
    }
    /**
	 * 设置：旅游路线介绍
	 */
    public String getLvyouluxianContent() {
        return lvyouluxianContent;
    }


    /**
	 * 获取：旅游路线介绍
	 */

    public void setLvyouluxianContent(String lvyouluxianContent) {
        this.lvyouluxianContent = lvyouluxianContent;
    }
    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
