package com.mybatis.springboot.dao;

import com.mybatis.springboot.pojo.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import java.util.List;

/** @author YangRui */
@Component
@Mapper
public interface TestMapper {
  @Select("select * from test;")
  List<Test> selectall();
}