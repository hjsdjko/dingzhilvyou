package com.entity.view;

import com.entity.LvyouluxianOrderEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 旅游路线订单
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("lvyouluxian_order")
public class LvyouluxianOrderView extends LvyouluxianOrderEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 订单类型的值
		*/
		private String lvyouluxianOrderValue;
		/**
		* 支付类型的值
		*/
		private String lvyouluxianOrderPaymentValue;



		//级联表 lvyouluxian
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
				* 旅游路线类型的值
				*/
				private String lvyouluxianValue;
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
				* 是否上架的值
				*/
				private String shangxiaValue;
			/**
			* 逻辑删除
			*/
			private Integer lvyouluxianDelete;
			/**
			* 旅游路线介绍
			*/
			private String lvyouluxianContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 用户手机号
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 用户头像
			*/
			private String yonghuPhoto;
			/**
			* 电子邮箱
			*/
			private String yonghuEmail;
			/**
			* 余额
			*/
			private Double newMoney;

	public LvyouluxianOrderView() {

	}

	public LvyouluxianOrderView(LvyouluxianOrderEntity lvyouluxianOrderEntity) {
		try {
			BeanUtils.copyProperties(this, lvyouluxianOrderEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 订单类型的值
			*/
			public String getLvyouluxianOrderValue() {
				return lvyouluxianOrderValue;
			}
			/**
			* 设置： 订单类型的值
			*/
			public void setLvyouluxianOrderValue(String lvyouluxianOrderValue) {
				this.lvyouluxianOrderValue = lvyouluxianOrderValue;
			}
			/**
			* 获取： 支付类型的值
			*/
			public String getLvyouluxianOrderPaymentValue() {
				return lvyouluxianOrderPaymentValue;
			}
			/**
			* 设置： 支付类型的值
			*/
			public void setLvyouluxianOrderPaymentValue(String lvyouluxianOrderPaymentValue) {
				this.lvyouluxianOrderPaymentValue = lvyouluxianOrderPaymentValue;
			}













				//级联表的get和set lvyouluxian
					/**
					* 获取： 旅游路线名称
					*/
					public String getLvyouluxianName() {
						return lvyouluxianName;
					}
					/**
					* 设置： 旅游路线名称
					*/
					public void setLvyouluxianName(String lvyouluxianName) {
						this.lvyouluxianName = lvyouluxianName;
					}
					/**
					* 获取： 旅游路线照片
					*/
					public String getLvyouluxianPhoto() {
						return lvyouluxianPhoto;
					}
					/**
					* 设置： 旅游路线照片
					*/
					public void setLvyouluxianPhoto(String lvyouluxianPhoto) {
						this.lvyouluxianPhoto = lvyouluxianPhoto;
					}
					/**
					* 获取： 旅游时间
					*/
					public String getLvyouluxianShijian() {
						return lvyouluxianShijian;
					}
					/**
					* 设置： 旅游时间
					*/
					public void setLvyouluxianShijian(String lvyouluxianShijian) {
						this.lvyouluxianShijian = lvyouluxianShijian;
					}
					/**
					* 获取： 行程安排
					*/
					public String getLvyouluxianXingcheng() {
						return lvyouluxianXingcheng;
					}
					/**
					* 设置： 行程安排
					*/
					public void setLvyouluxianXingcheng(String lvyouluxianXingcheng) {
						this.lvyouluxianXingcheng = lvyouluxianXingcheng;
					}
					/**
					* 获取： 旅游路线类型
					*/
					public Integer getLvyouluxianTypes() {
						return lvyouluxianTypes;
					}
					/**
					* 设置： 旅游路线类型
					*/
					public void setLvyouluxianTypes(Integer lvyouluxianTypes) {
						this.lvyouluxianTypes = lvyouluxianTypes;
					}


						/**
						* 获取： 旅游路线类型的值
						*/
						public String getLvyouluxianValue() {
							return lvyouluxianValue;
						}
						/**
						* 设置： 旅游路线类型的值
						*/
						public void setLvyouluxianValue(String lvyouluxianValue) {
							this.lvyouluxianValue = lvyouluxianValue;
						}
					/**
					* 获取： 剩余参与人数
					*/
					public Integer getLvyouluxianKucunNumber() {
						return lvyouluxianKucunNumber;
					}
					/**
					* 设置： 剩余参与人数
					*/
					public void setLvyouluxianKucunNumber(Integer lvyouluxianKucunNumber) {
						this.lvyouluxianKucunNumber = lvyouluxianKucunNumber;
					}
					/**
					* 获取： 旅游路线原价
					*/
					public Double getLvyouluxianOldMoney() {
						return lvyouluxianOldMoney;
					}
					/**
					* 设置： 旅游路线原价
					*/
					public void setLvyouluxianOldMoney(Double lvyouluxianOldMoney) {
						this.lvyouluxianOldMoney = lvyouluxianOldMoney;
					}
					/**
					* 获取： 现价
					*/
					public Double getLvyouluxianNewMoney() {
						return lvyouluxianNewMoney;
					}
					/**
					* 设置： 现价
					*/
					public void setLvyouluxianNewMoney(Double lvyouluxianNewMoney) {
						this.lvyouluxianNewMoney = lvyouluxianNewMoney;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getLvyouluxianClicknum() {
						return lvyouluxianClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setLvyouluxianClicknum(Integer lvyouluxianClicknum) {
						this.lvyouluxianClicknum = lvyouluxianClicknum;
					}
					/**
					* 获取： 是否上架
					*/
					public Integer getShangxiaTypes() {
						return shangxiaTypes;
					}
					/**
					* 设置： 是否上架
					*/
					public void setShangxiaTypes(Integer shangxiaTypes) {
						this.shangxiaTypes = shangxiaTypes;
					}


						/**
						* 获取： 是否上架的值
						*/
						public String getShangxiaValue() {
							return shangxiaValue;
						}
						/**
						* 设置： 是否上架的值
						*/
						public void setShangxiaValue(String shangxiaValue) {
							this.shangxiaValue = shangxiaValue;
						}
					/**
					* 获取： 逻辑删除
					*/
					public Integer getLvyouluxianDelete() {
						return lvyouluxianDelete;
					}
					/**
					* 设置： 逻辑删除
					*/
					public void setLvyouluxianDelete(Integer lvyouluxianDelete) {
						this.lvyouluxianDelete = lvyouluxianDelete;
					}
					/**
					* 获取： 旅游路线介绍
					*/
					public String getLvyouluxianContent() {
						return lvyouluxianContent;
					}
					/**
					* 设置： 旅游路线介绍
					*/
					public void setLvyouluxianContent(String lvyouluxianContent) {
						this.lvyouluxianContent = lvyouluxianContent;
					}










				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 用户手机号
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 用户手机号
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 用户头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 用户头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 电子邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 余额
					*/
					public Double getNewMoney() {
						return newMoney;
					}
					/**
					* 设置： 余额
					*/
					public void setNewMoney(Double newMoney) {
						this.newMoney = newMoney;
					}



}
