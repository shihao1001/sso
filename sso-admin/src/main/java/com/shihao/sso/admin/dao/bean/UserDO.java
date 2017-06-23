package com.shihao.sso.admin.dao.bean;



import java.io.Serializable;
import java.util.Date;

/**
	 * u_user po
	 * 
	 * @author mybatis generator
	 * @since 2017-06-20T18:39:14.074
	 */
public class UserDO implements Serializable {

    /** 序列化ID */
    private static final long serialVersionUID = -1L;

    /** 自增id */
    private Long id;
    /** 登录用户名 */
    private String name;
    /** 登录密码 */
    private String password;
    /** 更新时间 */
    private Date createTime;
    /** 创建时间 */
    private Date updateTime;

    /**
	 * 默认构造方法
	 */
    public UserDO() {
        
    }

    /**
	 * 主键构造方法
	 * 
	 * @param id 自增id
	 */
    public UserDO(Long id) {
        this.id = id;
    }

    /**
	 * 获取 自增id
	 * 
	 * @return 自增id
	 */
    public Long getId() {
        return id;
    }

    /**
	 * 设置 自增id
	 * 
	 * @param id 自增id
	 */
    public void setId(Long id) {
        this.id = id;
    }

    /**
	 * 获取 登录用户名
	 * 
	 * @return 登录用户名
	 */
    public String getName() {
        return name;
    }

    /**
	 * 设置 登录用户名
	 * 
	 * @param name 登录用户名
	 */
    public void setName(String name) {
        this.name = name;
    }

    /**
	 * 获取 登录密码
	 * 
	 * @return 登录密码
	 */
    public String getPassword() {
        return password;
    }

    /**
	 * 设置 登录密码
	 * 
	 * @param password 登录密码
	 */
    public void setPassword(String password) {
        this.password = password;
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
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}