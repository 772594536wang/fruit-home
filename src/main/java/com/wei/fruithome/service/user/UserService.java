package com.wei.fruithome.service.user;

import com.wei.fruithome.entity.user.User;

public interface UserService {

    /**
     * 用户注册
     * @param user 用户信息
     */
    void register(User user);

    /**
     * 验证登录信息
     * @param user 登录用户
     * @return 成功 1 失败 0
     */
    boolean verifyUserLogin(User user);

    /**
     * 验证手机号是否存在
     * @param telephone 手机号码
     * @return true 不存在 false 存在
     */
    boolean verifyTelephone(String telephone);

    /**
     * 验证用户名称是否存在
     * @param username 用户名
     * @return true 不存在 false 存在
     */
    boolean verifyUsername(String username);

}
