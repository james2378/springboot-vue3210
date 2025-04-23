package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 教案
 *
 * @author 
 * @email
 */
@TableName("kecheng")
public class KechengEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public KechengEntity() {

	}

	public KechengEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 教师
     */
    @TableField(value = "jiaoshi_id")

    private Integer jiaoshiId;


    /**
     * 教案名称
     */
    @TableField(value = "kecheng_name")

    private String kechengName;


    /**
     * 教案照片
     */
    @TableField(value = "kecheng_photo")

    private String kechengPhoto;


    /**
     * 教案
     */
    @TableField(value = "kecheng_file")

    private String kechengFile;


    /**
     * 教案类型
     */
    @TableField(value = "kecheng_types")

    private Integer kechengTypes;


    /**
     * 点击次数
     */
    @TableField(value = "kecheng_clicknum")

    private Integer kechengClicknum;


    /**
     * 逻辑删除
     */
    @TableField(value = "kecheng_delete")

    private Integer kechengDelete;


    /**
     * 教案介绍
     */
    @TableField(value = "kecheng_content")

    private String kechengContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：教师
	 */
    public Integer getJiaoshiId() {
        return jiaoshiId;
    }
    /**
	 * 获取：教师
	 */

    public void setJiaoshiId(Integer jiaoshiId) {
        this.jiaoshiId = jiaoshiId;
    }
    /**
	 * 设置：教案名称
	 */
    public String getKechengName() {
        return kechengName;
    }
    /**
	 * 获取：教案名称
	 */

    public void setKechengName(String kechengName) {
        this.kechengName = kechengName;
    }
    /**
	 * 设置：教案照片
	 */
    public String getKechengPhoto() {
        return kechengPhoto;
    }
    /**
	 * 获取：教案照片
	 */

    public void setKechengPhoto(String kechengPhoto) {
        this.kechengPhoto = kechengPhoto;
    }
    /**
	 * 设置：教案
	 */
    public String getKechengFile() {
        return kechengFile;
    }
    /**
	 * 获取：教案
	 */

    public void setKechengFile(String kechengFile) {
        this.kechengFile = kechengFile;
    }
    /**
	 * 设置：教案类型
	 */
    public Integer getKechengTypes() {
        return kechengTypes;
    }
    /**
	 * 获取：教案类型
	 */

    public void setKechengTypes(Integer kechengTypes) {
        this.kechengTypes = kechengTypes;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getKechengClicknum() {
        return kechengClicknum;
    }
    /**
	 * 获取：点击次数
	 */

    public void setKechengClicknum(Integer kechengClicknum) {
        this.kechengClicknum = kechengClicknum;
    }
    /**
	 * 设置：逻辑删除
	 */
    public Integer getKechengDelete() {
        return kechengDelete;
    }
    /**
	 * 获取：逻辑删除
	 */

    public void setKechengDelete(Integer kechengDelete) {
        this.kechengDelete = kechengDelete;
    }
    /**
	 * 设置：教案介绍
	 */
    public String getKechengContent() {
        return kechengContent;
    }
    /**
	 * 获取：教案介绍
	 */

    public void setKechengContent(String kechengContent) {
        this.kechengContent = kechengContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Kecheng{" +
            "id=" + id +
            ", jiaoshiId=" + jiaoshiId +
            ", kechengName=" + kechengName +
            ", kechengPhoto=" + kechengPhoto +
            ", kechengFile=" + kechengFile +
            ", kechengTypes=" + kechengTypes +
            ", kechengClicknum=" + kechengClicknum +
            ", kechengDelete=" + kechengDelete +
            ", kechengContent=" + kechengContent +
            ", createTime=" + createTime +
        "}";
    }
}
