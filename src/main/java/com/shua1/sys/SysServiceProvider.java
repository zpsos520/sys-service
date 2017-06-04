package com.shua1.sys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class SysServiceProvider {
	public static void main(String[] args) {
		SpringApplication.run(SysServiceProvider.class, args);
		try {  
            System.in.read();  
        } catch (Exception e) {  
            e.printStackTrace();  
        }  
	}
}
