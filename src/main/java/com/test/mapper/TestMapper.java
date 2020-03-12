package com.test.mapper;

import com.test.pojo.Test;

import java.util.List;

public interface TestMapper {

    /**
     * 查询
     *
     * @return
     */
    List<Test> queryTest();

    /**
     * 插入数据
     *
     * @return
     */
    int addTest(Test test);

}
