package com.teye.gateway.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.ComponentScan;

import com.teye.gateway.service.filter.PreFilter;

@SpringBootApplication
@EnableZuulProxy
@ComponentScan(basePackageClasses={PreFilter.class})
public class EcommerceGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceGatewayServiceApplication.class, args);
	}
}
