package com.shihao.sso.admin.dao.bean;

import java.io.Serializable;
import java.util.Date;

/**
	 * a_app po
	 * 
	 * @author mybatis generator
	 * @since 2017-06-20T22:27:41.988
	 */
public class AppDO implements Serializable {

    /** 序列化ID */
    private static final long serialVersionUID = -1L;

    /** 自增id */
    private Integer id;
    /** app code */
    private String code;
    /** app名称 */
    private String name;
    /** app回调地址 */
    private String callback;
    /** app签名盐 */
    private String md5Salt;
    /** 更新时间 */
    private Date createTime;
    /** 创建时间 */
    private Date updateTime;

    /**
	 * 默认构造方法
	 */
    public AppDO() {
        
    }

    /**
	 * 主键构造方法
	 * 
	 * @param id 自增id
	 */
    public AppDO(Integer id) {
        this.id = id;
    }

    /**
	 * 获取 自增id
	 * 
	 * @return 自增id
	 */
    public Integer getId() {
        return id;
    }

    /**
	 * 设置 自增id
	 * 
	 * @param id 自增id
	 */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
	 * 获取 app code
	 * 
	 * @return app code
	 */
    public String getCode() {
        return code;
    }

    /**
	 * 设置 app code
	 * 
	 * @param code app code
	 */
    public void setCode(String code) {
        this.code = code;
    }

    /**
	 * 获取 app名称
	 * 
	 * @return app名称
	 */
    public String getName() {
        return name;
    }

    /**
	 * 设置 app名称
	 * 
	 * @param name app名称
	 */
    public void setName(String name) {
        this.name = name;
    }

    /**
	 * 获取 app回调地址
	 * 
	 * @return app回调地址
	 */
    public String getCallback() {
        return callback;
    }

    /**
	 * 设置 app回调地址
	 * 
	 * @param callback app回调地址
	 */
    public void setCallback(String callback) {
        this.callback = callback;
    }

    /**
	 * 获取 app签名盐
	 * 
	 * @return app签名盐
	 */
    public String getMd5Salt() {
        return md5Salt;
    }

    /**
	 * 设置 app签名盐
	 * 
	 * @param md5Salt app签名盐
	 */
    public void setMd5Salt(String md5Salt) {
        this.md5Salt = md5Salt;
    }

    /**
	 * 获取 更新时间
	 * 
	 * @return 更新时间
	 */
    public Date getCreateTime() {
        return createTime;
    }

    /**
	 * 设置 更新时间
	 * 
	 * @param createTime 更新时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
	 * 获取 创建时间
	 * 
	 * @return 创建时间
	 */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
	 * 设置 创建时间
	 * 
	 * @param updateTime 创建时间
	 */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", callback=").append(callback);
        sb.append(", md5Salt=").append(md5Salt);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}