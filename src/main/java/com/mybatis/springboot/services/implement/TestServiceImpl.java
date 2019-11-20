package com.mybatis.springboot.services.implement;

import com.mybatis.springboot.dao.TestMapper;
import com.mybatis.springboot.pojo.Test;
import com.mybatis.springboot.services.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/** @author YangRui */
@Service
public class TestServiceImpl implements TestService {

  @Resource private TestMapper testMapper;

  @Override
  public List<Test> selectallTest() {

    List<Test> tests = testMapper.selectall();
    for (Test test : tests) {
      System.out.println(test.getId());
      System.out.println(test.getName());
    }

   // HashMap<String,String> qwe =  Map<String ,String>();

    return tests;
  }
}
