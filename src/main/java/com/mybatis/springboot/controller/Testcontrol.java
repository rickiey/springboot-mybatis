package com.mybatis.springboot.controller;

import com.mybatis.springboot.pojo.Test;
import com.mybatis.springboot.services.TestService;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/** @author YangRui
 */
@RestController
@EnableAutoConfiguration
public class Testcontrol {

  @Resource private TestService testService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public List<Test> getUser() {
    return testService.selectallTest();
  }
}
