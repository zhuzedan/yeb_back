package com.zzd.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zzd.server.mapper")
public class VoaAppliation {
    public static void main(String[] args) {
        SpringApplication.run(VoaAppliation.class,args);
    }
}
