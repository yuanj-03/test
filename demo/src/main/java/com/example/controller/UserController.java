package com.example.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.pojo.IMoocJSONResult;
import com.example.pojo.Resource;
import com.example.pojo.User;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/getUser")
	public User getUser() {
		
		User u = new User();
		u.setName("imooc");
		u.setAge(18);
		u.setPassword("imooc");
		u.setBirthday(new Date());
		return u;
	}
	
	@RequestMapping("/getUserJson")
	public IMoocJSONResult getUserJson() {
		
		User u = new User();
		u.setName("imooc");
		u.setAge(18);
		u.setPassword("imooc");
		u.setBirthday(new Date());
		return IMoocJSONResult.ok(u);
	}
	
}
