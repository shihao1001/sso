package com.shihao.sso.admin.mapper;

import com.shihao.sso.admin.dao.bean.UserDO;



/**
	 * u_user mapper
	 * 
	 * @author mybatis generator
	 * @since 2017-06-20T18:39:14.081
	 */
public interface UserMapper {
	
	/**
	 * 根据name查找记录
	 * 
	 * @param name 名称
	 * @return 对应记录
	 */
	UserDO getByName(String name);
	
    /**
	 * 根据主键查找记录
	 * 
	 * @param id 主键
	 * @return 对应记录
	 */
    UserDO getById(Long id);

    /**
	 * 修改记录
	 * 
	 * @param record 要修改的记录
	 * @return 修改记录数
	 */
    Integer modify(UserDO record);

    /**
	 * 选择性的修改记录
	 * 
	 * @param record 要修改的记录
	 * @return 修改记录数
	 */
    Integer modifySelective(UserDO record);

    /**
	 * 插入记录
	 * 
	 * @param record 要插入的记录
	 * @return 插入记录数
	 */
    Integer save(UserDO record);

    /**
	 * 删除记录
	 * 
	 * @param id 要删除的记录ID
	 * @return 删除记录数
	 */
    Integer delById(Long id);
}