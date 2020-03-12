package com.test.controller;


import com.test.pojo.Test;
import com.test.service.TestService;
import com.test.util.ThreadPool;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

@RestController
//@Controller
@RequestMapping("/test")
@CrossOrigin
public class TestController {

    @Resource
    private TestService testService;

    @RequestMapping(value = "/threadPool", method = RequestMethod.GET)
    //@ResponseBody // 返回json格式的数据
    public String threadPool() {

        List<Test> list = new ArrayList<Test>();
        Test test1 = new Test(0, "小明", 20);
        Test test2 = new Test(0, "小红", 20);
        Test test3 = new Test(0, "小强", 20);
        Test test4 = new Test(0, "小敏", 20);
        Test test5 = new Test(0, "小懒", 20);
        Test test6 = new Test(0, "小虎", 20);
        list.add(test1);
        list.add(test2);
        list.add(test3);
        list.add(test4);
        list.add(test5);
        list.add(test6);
        // 锁存器
        CountDownLatch latch = new CountDownLatch(list.size());
        ThreadPool threadPool = new ThreadPool(list, latch);
        int a = threadPool.work();
        return "success:" + a + "\terror:" + (list.size() - a);
    }

    @RequestMapping(value = "/queryTest", method = RequestMethod.GET)
    public List<Test> queryTest() {
        return testService.queryTest();
    }

    @RequestMapping(value = "/addTest", method = RequestMethod.POST)
    // @RequestBody JSON格式参数
    public int addTest(@RequestBody Test test) {
        int result = testService.addTest(test);
        return result;
    }

}
