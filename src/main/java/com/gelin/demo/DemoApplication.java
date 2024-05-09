package com.gelin.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    /**
     * 应用程序的主入口点。
     *
     * @param args 命令行参数，传递给SpringApplication的运行方法。
     * @see SpringApplication#run(Class, String...)
     */
    public static void main(String[] args) {
        // 启动Spring应用
        SpringApplication.run(DemoApplication.class, args);
    }

}
