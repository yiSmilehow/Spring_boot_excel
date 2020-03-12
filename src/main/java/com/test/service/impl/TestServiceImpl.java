package com.test.service.impl;

import com.test.mapper.TestMapper;
import com.test.pojo.Test;
import com.test.service.TestService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Resource
    private TestMapper testMapper;

    public List<Test> queryTest() {
        return testMapper.queryTest();
    }

    public int addTest(Test test) {
        return testMapper.addTest(test);
    }
}
