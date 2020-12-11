package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.IMoocJSONResult;

@RestController
@RequestMapping("redis")
public class RedisController {
	
	@Autowired
	private StringRedisTemplate strRedis;
	
	@RequestMapping("/test")
	public IMoocJSONResult test() {
		strRedis.opsForValue().set("imooc-cache","hello 慕课网");
		return IMoocJSONResult.ok(strRedis.opsForValue().get("imooc-cache"));
	}

}
