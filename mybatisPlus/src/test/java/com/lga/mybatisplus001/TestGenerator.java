package com.lga.mybatisplus001;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import org.junit.Test;

public class TestGenerator {


    @Test
    public void test(){

        //创建mbg
        AutoGenerator mpg = new AutoGenerator();

        //全局设置
        GlobalConfig gc = new GlobalConfig();
        gc.setAuthor("liuGaoAn");   //作者
        gc.setActiveRecord(true);   //开启活动记录
        gc.setBaseColumnList(true); //开启通用字段
        gc.setBaseResultMap(true);  //基本的映射
        gc.setIdType(IdType.AUTO); //设置主键生成策略 字段增长
        gc.setServiceName("%Service"); //设置服务的名称
        gc.setServiceImplName("%ServiceImpl"); //设置服务的实现类名称
        gc.setMapperName("%Mapper"); //设置dao层名称
        gc.setOutputDir("E:\\jianshu\\mybatisPlus\\src\\main\\java"); //设置输出的目录
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/mybatis-plus-course?serverTimezone=UTC&useUnicode=true&useSSL=false&characterEncoding=utf8");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("com.lga.mpc");
        pc.setEntity("domain");
        pc.setService("service");
        pc.setServiceImpl("serviceImpl");
        pc.setMapper("mapper");
        pc.setController("controller");
        pc.setXml("mapper");
        mpg.setPackageInfo(pc);

        //策略配置
        StrategyConfig strategy = new StrategyConfig();
        strategy.setNaming(NamingStrategy.underline_to_camel);
        strategy.setColumnNaming(NamingStrategy.underline_to_camel); //下划线转驼峰
        strategy.setEntityLombokModel(true);
        strategy.setRestControllerStyle(true);
        strategy.setInclude("sys_user");
        strategy.setControllerMappingHyphenStyle(true);
        strategy.setTablePrefix("sys_");
        mpg.setStrategy(strategy);

        mpg.execute();





    }

}
