package com.entity.view;

import com.entity.HuidaEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 回答
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("huida")
public class HuidaView extends HuidaEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 批改状态的值
		*/
		private String huidaValue;



		//级联表 xuesheng
			/**
			* 学生姓名
			*/
			private String xueshengName;
			/**
			* 学生手机号
			*/
			private String xueshengPhone;
			/**
			* 学生身份证号
			*/
			private String xueshengIdNumber;
			/**
			* 学生头像
			*/
			private String xueshengPhoto;
			/**
			* 班级
			*/
			private Integer banjiTypes;
				/**
				* 班级的值
				*/
				private String banjiValue;
			/**
			* 电子邮箱
			*/
			private String xueshengEmail;

		//级联表 zuoye
			/**
			* 作业 的 教师
			*/
			private Integer zuoyeJiaoshiId;

			/**
			* 作业唯一编号
			*/
			private String zuoyeUuidNumber;
			/**
			* 作业名称
			*/
			private String zuoyeName;
			/**
			* 作业类型
			*/
			private Integer zuoyeTypes;
				/**
				* 作业类型的值
				*/
				private String zuoyeValue;
			/**
			* 作业文件
			*/
			private String zuoyeFile;
			/**
			* 作业详情
			*/
			private String zuoyeContent;

	public HuidaView() {

	}

	public HuidaView(HuidaEntity huidaEntity) {
		try {
			BeanUtils.copyProperties(this, huidaEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 批改状态的值
			*/
			public String getHuidaValue() {
				return huidaValue;
			}
			/**
			* 设置： 批改状态的值
			*/
			public void setHuidaValue(String huidaValue) {
				this.huidaValue = huidaValue;
			}


























				//级联表的get和set xuesheng

					/**
					* 获取： 学生姓名
					*/
					public String getXueshengName() {
						return xueshengName;
					}
					/**
					* 设置： 学生姓名
					*/
					public void setXueshengName(String xueshengName) {
						this.xueshengName = xueshengName;
					}

					/**
					* 获取： 学生手机号
					*/
					public String getXueshengPhone() {
						return xueshengPhone;
					}
					/**
					* 设置： 学生手机号
					*/
					public void setXueshengPhone(String xueshengPhone) {
						this.xueshengPhone = xueshengPhone;
					}

					/**
					* 获取： 学生身份证号
					*/
					public String getXueshengIdNumber() {
						return xueshengIdNumber;
					}
					/**
					* 设置： 学生身份证号
					*/
					public void setXueshengIdNumber(String xueshengIdNumber) {
						this.xueshengIdNumber = xueshengIdNumber;
					}

					/**
					* 获取： 学生头像
					*/
					public String getXueshengPhoto() {
						return xueshengPhoto;
					}
					/**
					* 设置： 学生头像
					*/
					public void setXueshengPhoto(String xueshengPhoto) {
						this.xueshengPhoto = xueshengPhoto;
					}


					/**
					* 获取： 电子邮箱
					*/
					public String getXueshengEmail() {
						return xueshengEmail;
					}
					/**
					* 设置： 电子邮箱
					*/
					public void setXueshengEmail(String xueshengEmail) {
						this.xueshengEmail = xueshengEmail;
					}


				//级联表的get和set zuoye

					/**
					* 获取：作业 的 教师
					*/
					public Integer getZuoyeJiaoshiId() {
						return zuoyeJiaoshiId;
					}
					/**
					* 设置：作业 的 教师
					*/
					public void setZuoyeJiaoshiId(Integer zuoyeJiaoshiId) {
						this.zuoyeJiaoshiId = zuoyeJiaoshiId;
					}


					/**
					* 获取： 班级
					*/
					public Integer getBanjiTypes() {
						return banjiTypes;
					}
					/**
					* 设置： 班级
					*/
					public void setBanjiTypes(Integer banjiTypes) {
						this.banjiTypes = banjiTypes;
					}


						/**
						* 获取： 班级的值
						*/
						public String getBanjiValue() {
							return banjiValue;
						}
						/**
						* 设置： 班级的值
						*/
						public void setBanjiValue(String banjiValue) {
							this.banjiValue = banjiValue;
						}

					/**
					* 获取： 作业唯一编号
					*/
					public String getZuoyeUuidNumber() {
						return zuoyeUuidNumber;
					}
					/**
					* 设置： 作业唯一编号
					*/
					public void setZuoyeUuidNumber(String zuoyeUuidNumber) {
						this.zuoyeUuidNumber = zuoyeUuidNumber;
					}

					/**
					* 获取： 作业名称
					*/
					public String getZuoyeName() {
						return zuoyeName;
					}
					/**
					* 设置： 作业名称
					*/
					public void setZuoyeName(String zuoyeName) {
						this.zuoyeName = zuoyeName;
					}

					/**
					* 获取： 作业类型
					*/
					public Integer getZuoyeTypes() {
						return zuoyeTypes;
					}
					/**
					* 设置： 作业类型
					*/
					public void setZuoyeTypes(Integer zuoyeTypes) {
						this.zuoyeTypes = zuoyeTypes;
					}


						/**
						* 获取： 作业类型的值
						*/
						public String getZuoyeValue() {
							return zuoyeValue;
						}
						/**
						* 设置： 作业类型的值
						*/
						public void setZuoyeValue(String zuoyeValue) {
							this.zuoyeValue = zuoyeValue;
						}

					/**
					* 获取： 作业文件
					*/
					public String getZuoyeFile() {
						return zuoyeFile;
					}
					/**
					* 设置： 作业文件
					*/
					public void setZuoyeFile(String zuoyeFile) {
						this.zuoyeFile = zuoyeFile;
					}

					/**
					* 获取： 作业详情
					*/
					public String getZuoyeContent() {
						return zuoyeContent;
					}
					/**
					* 设置： 作业详情
					*/
					public void setZuoyeContent(String zuoyeContent) {
						this.zuoyeContent = zuoyeContent;
					}




}
