package com.test.service;

import com.test.pojo.Test;

import java.util.List;

public interface TestService {

    /**
     * @return
     */
    List<Test> queryTest();

    /**
     * @return
     */
    int addTest(Test test);
}
