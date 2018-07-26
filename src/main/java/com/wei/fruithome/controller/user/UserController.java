package com.wei.fruithome.controller.user;

import com.wei.fruithome.entity.user.User;
import com.wei.fruithome.service.user.UserService;
import com.wei.fruithome.utils.Result;
import com.wei.fruithome.utils.ResultBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    // 登录
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    @ResponseBody
    public void login(@RequestParam("username") String username,@RequestParam("password") String password){
        // 判断用户名和密码是否正确

        // 否者直接登录进入
    }

    // 注册
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public Result register(@RequestParam("username") String username,
                           @RequestParam("password") String password){
        // 注册手机号必须验证

        // 判断用户是否存在
        boolean noExist = userService.verifyUsername(username);
        if(noExist){
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            userService.register(user);
            return ResultBuilder.buildResultCommon("register success!").setOk();
        }else {
            return ResultBuilder.buildResultCommon("username exist!").setError();
        }
    }

    // 密码找回
    public void findPassword(){

    }

}
