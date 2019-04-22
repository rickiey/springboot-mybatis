package com.mybatis.springboot.services;

import com.mybatis.springboot.pojo.Test;

import java.util.List;

/** @author YangRui */
public interface TestService {
  List<Test> selectallTest();
}
