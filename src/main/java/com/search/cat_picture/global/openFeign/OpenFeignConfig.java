package com.search.cat_picture.global.openFeign;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients("com.search.cat_picture")
public class OpenFeignConfig {
}
