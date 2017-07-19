package com.fnps.mybaties.config;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by 淮哲琪 on 2017/7/19.
 * 被继承的Mapper，一般业务Mapper继承它
 */
public interface BissnessMapper<T> extends Mapper<T>,MySqlMapper<T>
{
//    TODO
//    FIXME 特别注意，该接口不能被扫描到，否则会出错
}
