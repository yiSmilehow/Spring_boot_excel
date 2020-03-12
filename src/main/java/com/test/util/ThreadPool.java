package com.test.util;

import com.test.pojo.Test;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    //数据
    private List<Test> list;

    // 锁存器 等于0时释放
    private CountDownLatch latch;

    // 线程池
    private ExecutorService executorService = Executors.newFixedThreadPool(20);

    //计数
    private int a = 0;

    private final String url = "http://192.168.101.5:8080/test/addTest";

    public int work() {
        for (final Test temp : list) {
            // 执行多线程任务
            executorService.execute(new Runnable() {
                public void run() {
                    try {
                        RestTemplate restTemplate = new RestTemplate();
                        Integer result = restTemplate.postForObject(url, temp, Integer.class);
                        if (result > 0) {
                            a++;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                        // 每走一次 锁存器就减1
                        latch.countDown();
                    }
                }
            });
        }
        try {
            // 如果锁存器的计数不等于0 所有线程不予通过
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a;
    }


    public ThreadPool() {
    }

    public ThreadPool(List<Test> list, CountDownLatch latch) {
        this.list = list;
        this.latch = latch;
    }

}
