package com.vstaryw.web.util;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * 继承自己的MyMapper
 *
 * @author yuw
 * @since 2016/03/11
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {

}
