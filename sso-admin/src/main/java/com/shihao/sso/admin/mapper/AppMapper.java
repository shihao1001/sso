package com.shihao.sso.admin.mapper;

import com.shihao.sso.admin.dao.bean.AppDO;

/**
	 * a_app mapper
	 * 
	 * @author mybatis generator
	 * @since 2017-06-20T22:19:05.086
	 */
public interface AppMapper {
	
	
	
	AppDO getByCode(String code);
	
    /**
	 * 根据主键查找记录
	 * 
	 * @param id 主键
	 * @return 对应记录
	 */
    AppDO getById(Integer id);

    /**
	 * 修改记录
	 * 
	 * @param record 要修改的记录
	 * @return 修改记录数
	 */
    Integer modify(AppDO record);

    /**
	 * 选择性的修改记录
	 * 
	 * @param record 要修改的记录
	 * @return 修改记录数
	 */
    Integer modifySelective(AppDO record);

    /**
	 * 插入记录
	 * 
	 * @param record 要插入的记录
	 * @return 插入记录数
	 */
    Integer save(AppDO record);

    /**
	 * 删除记录
	 * 
	 * @param id 要删除的记录ID
	 * @return 删除记录数
	 */
    Integer delById(Integer id);
}