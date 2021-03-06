package com.zhzx.dao.service.common;

import com.zhzx.dao.service.BaseService;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhzx.dao.mapper.common.BdictionaryMapper;

/**
 * 
 * <br>
 * <b>功能：</b>BdictionaryService<br>
 * <b>作者：</b>陈浩<br>
 * <b>日期：</b> Dec 9, 2011 <br>
 */
@Service()
public class BdictionaryService<T> extends BaseService<T> {
	private final static Logger log= Logger.getLogger(BdictionaryService.class);
	

	

	@Autowired
    private BdictionaryMapper<T> mapper;

		
	public BdictionaryMapper<T> getMapper() {
		return mapper;
	}

}
