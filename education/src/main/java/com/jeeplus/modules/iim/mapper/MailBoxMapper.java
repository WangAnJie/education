package com.jeeplus.modules.iim.mapper;

import com.jeeplus.core.persistence.BaseMapper;
import com.jeeplus.core.persistence.annotation.MyBatisMapper;
import com.jeeplus.modules.iim.entity.MailBox;

/**
 * 发件箱MAPPER接口
 * @version 2015-11-15
 */
@MyBatisMapper
public interface MailBoxMapper extends BaseMapper<MailBox> {
	
	public int getCount(MailBox entity);
	
}