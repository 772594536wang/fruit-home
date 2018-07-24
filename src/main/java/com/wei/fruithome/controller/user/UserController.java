package com.wei.fruithome.controller.user;

import com.wei.fruithome.service.user.UserService;
import com.wei.fruithome.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    // 登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public void login(@RequestParam("username") String username,@RequestParam("password") String password){

    }

    // 注册
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Result register(@RequestParam("username") String username, @RequestParam("password") String password){
        userService.register(username,password);
        Result res = new Result();
        res.setMsg("request success");
        res.setStatus(200);
        return res;
    }

    // 密码找回
    public void findPassword(){

    }

}
