package com.spring_cloud.eureka.client.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
public class ProductController {
	@Value("${server.port}")
	private String port;

	@Value("${message}")
	private String message;

	@GetMapping("/product")
	public String getProduct() {
		return "Product info!!!!! From port : " + port + "and message : " + message;
	}
}
