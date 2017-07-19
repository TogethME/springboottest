package com.fnps.mybaties.config;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Configuration;
import tk.mybatis.spring.mapper.MapperScannerConfigurer;

import java.util.Properties;

/**
 * Created by 淮哲琪 on 2017/7/19.
 * MyBatis扫描接口，使用的tk.mybatis.spring.mapper.MapperScannerConfigurer <br/>
 * 如果你不使用通用Mapper，可以改为org.xxx...
 */
@Configuration
@AutoConfigureAfter(MybatisAutoConfiguration.class)
public class MyBatisMapperScannerConfig {

    public MapperScannerConfigurer mapperScannerConfigurer(){
        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
        mapperScannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
        mapperScannerConfigurer.setBasePackage("com.fnps.mapper");

        Properties properties = new Properties();
        // 这里要特别注意，不要把MyMapper放到 basePackage 中，也就是不能同其他Mapper一样被扫描到。
        properties.setProperty("mappers", BusinessMapper.class.getName());
        properties.setProperty("notEmpty", "false");
        properties.setProperty("IDENTITY", "MYSQL");
        mapperScannerConfigurer.setProperties(properties);
        return mapperScannerConfigurer;
    }
}
