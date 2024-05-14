package com.entity.model;

import com.entity.LvyouluxianEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 旅游路线
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class LvyouluxianModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 旅游路线名称
     */
    private String lvyouluxianName;


    /**
     * 旅游路线照片
     */
    private String lvyouluxianPhoto;


    /**
     * 旅游时间
     */
    private String lvyouluxianShijian;


    /**
     * 行程安排
     */
    private String lvyouluxianXingcheng;


    /**
     * 旅游路线类型
     */
    private Integer lvyouluxianTypes;


    /**
     * 剩余参与人数
     */
    private Integer lvyouluxianKucunNumber;


    /**
     * 旅游路线原价
     */
    private Double lvyouluxianOldMoney;


    /**
     * 现价
     */
    private Double lvyouluxianNewMoney;


    /**
     * 点击次数
     */
    private Integer lvyouluxianClicknum;


    /**
     * 是否上架
     */
    private Integer shangxiaTypes;


    /**
     * 逻辑删除
     */
    private Integer lvyouluxianDelete;


    /**
     * 旅游路线介绍
     */
    private String lvyouluxianContent;


    /**
     * 创建时间  show1 show2 photoShow
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
	 * 获取：旅游路线名称
	 */
    public String getLvyouluxianName() {
        return lvyouluxianName;
    }


    /**
	 * 设置：旅游路线名称
	 */
    public void setLvyouluxianName(String lvyouluxianName) {
        this.lvyouluxianName = lvyouluxianName;
    }
    /**
	 * 获取：旅游路线照片
	 */
    public String getLvyouluxianPhoto() {
        return lvyouluxianPhoto;
    }


    /**
	 * 设置：旅游路线照片
	 */
    public void setLvyouluxianPhoto(String lvyouluxianPhoto) {
        this.lvyouluxianPhoto = lvyouluxianPhoto;
    }
    /**
	 * 获取：旅游时间
	 */
    public String getLvyouluxianShijian() {
        return lvyouluxianShijian;
    }


    /**
	 * 设置：旅游时间
	 */
    public void setLvyouluxianShijian(String lvyouluxianShijian) {
        this.lvyouluxianShijian = lvyouluxianShijian;
    }
    /**
	 * 获取：行程安排
	 */
    public String getLvyouluxianXingcheng() {
        return lvyouluxianXingcheng;
    }


    /**
	 * 设置：行程安排
	 */
    public void setLvyouluxianXingcheng(String lvyouluxianXingcheng) {
        this.lvyouluxianXingcheng = lvyouluxianXingcheng;
    }
    /**
	 * 获取：旅游路线类型
	 */
    public Integer getLvyouluxianTypes() {
        return lvyouluxianTypes;
    }


    /**
	 * 设置：旅游路线类型
	 */
    public void setLvyouluxianTypes(Integer lvyouluxianTypes) {
        this.lvyouluxianTypes = lvyouluxianTypes;
    }
    /**
	 * 获取：剩余参与人数
	 */
    public Integer getLvyouluxianKucunNumber() {
        return lvyouluxianKucunNumber;
    }


    /**
	 * 设置：剩余参与人数
	 */
    public void setLvyouluxianKucunNumber(Integer lvyouluxianKucunNumber) {
        this.lvyouluxianKucunNumber = lvyouluxianKucunNumber;
    }
    /**
	 * 获取：旅游路线原价
	 */
    public Double getLvyouluxianOldMoney() {
        return lvyouluxianOldMoney;
    }


    /**
	 * 设置：旅游路线原价
	 */
    public void setLvyouluxianOldMoney(Double lvyouluxianOldMoney) {
        this.lvyouluxianOldMoney = lvyouluxianOldMoney;
    }
    /**
	 * 获取：现价
	 */
    public Double getLvyouluxianNewMoney() {
        return lvyouluxianNewMoney;
    }


    /**
	 * 设置：现价
	 */
    public void setLvyouluxianNewMoney(Double lvyouluxianNewMoney) {
        this.lvyouluxianNewMoney = lvyouluxianNewMoney;
    }
    /**
	 * 获取：点击次数
	 */
    public Integer getLvyouluxianClicknum() {
        return lvyouluxianClicknum;
    }


    /**
	 * 设置：点击次数
	 */
    public void setLvyouluxianClicknum(Integer lvyouluxianClicknum) {
        this.lvyouluxianClicknum = lvyouluxianClicknum;
    }
    /**
	 * 获取：是否上架
	 */
    public Integer getShangxiaTypes() {
        return shangxiaTypes;
    }


    /**
	 * 设置：是否上架
	 */
    public void setShangxiaTypes(Integer shangxiaTypes) {
        this.shangxiaTypes = shangxiaTypes;
    }
    /**
	 * 获取：逻辑删除
	 */
    public Integer getLvyouluxianDelete() {
        return lvyouluxianDelete;
    }


    /**
	 * 设置：逻辑删除
	 */
    public void setLvyouluxianDelete(Integer lvyouluxianDelete) {
        this.lvyouluxianDelete = lvyouluxianDelete;
    }
    /**
	 * 获取：旅游路线介绍
	 */
    public String getLvyouluxianContent() {
        return lvyouluxianContent;
    }


    /**
	 * 设置：旅游路线介绍
	 */
    public void setLvyouluxianContent(String lvyouluxianContent) {
        this.lvyouluxianContent = lvyouluxianContent;
    }
    /**
	 * 获取：创建时间  show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间  show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
