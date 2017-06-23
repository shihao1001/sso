package com.shihao.sso.admin.dao.bean;

import java.io.Serializable;
import java.util.Date;

/**
	 * u_token po
	 * 
	 * @author mybatis generator
	 * @since 2017-06-20T22:38:52.537
	 */
public class TokenDO implements Serializable {

    /** 序列化ID */
    private static final long serialVersionUID = -1L;

    /** 自增id */
    private Long id;
    /** 用户id */
    private Long userId;
    /** token */
    private String token;
    /** 有效期至 */
    private Date expireTime;
    /** 更新时间 */
    private Date createTime;
    /** 创建时间 */
    private Date updateTime;
    /** 是否有效 **/
    private Byte isActive;

    /**
	 * @return the isActive
	 */
	public Byte getIsActive() {
		return isActive;
	}

	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(Byte isActive) {
		this.isActive = isActive;
	}

	/**
	 * 默认构造方法
	 */
    public TokenDO() {
        
    }

    /**
	 * 主键构造方法
	 * 
	 * @param id 自增id
	 */
    public TokenDO(Long id) {
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
	 * 获取 用户id
	 * 
	 * @return 用户id
	 */
    public Long getUserId() {
        return userId;
    }

    /**
	 * 设置 用户id
	 * 
	 * @param userId 用户id
	 */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
	 * 获取 token
	 * 
	 * @return token
	 */
    public String getToken() {
        return token;
    }

    /**
	 * 设置 token
	 * 
	 * @param token token
	 */
    public void setToken(String token) {
        this.token = token;
    }

    /**
	 * 获取 有效期至
	 * 
	 * @return 有效期至
	 */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
	 * 设置 有效期至
	 * 
	 * @param expireTime 有效期至
	 */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
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

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "TokenDO [id=" + id + ", userId=" + userId + ", token=" + token
				+ ", expireTime=" + expireTime + ", createTime=" + createTime
				+ ", updateTime=" + updateTime + ", isActive=" + isActive + "]";
	}

   
}