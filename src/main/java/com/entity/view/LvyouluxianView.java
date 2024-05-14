package com.entity.view;

import com.entity.LvyouluxianEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 旅游路线
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("lvyouluxian")
public class LvyouluxianView extends LvyouluxianEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 旅游路线类型的值
		*/
		private String lvyouluxianValue;
		/**
		* 是否上架的值
		*/
		private String shangxiaValue;



	public LvyouluxianView() {

	}

	public LvyouluxianView(LvyouluxianEntity lvyouluxianEntity) {
		try {
			BeanUtils.copyProperties(this, lvyouluxianEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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










}
