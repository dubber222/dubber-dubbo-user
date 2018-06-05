package com.dubber.dubbo.user;

import com.dubber.dubbo.user.dto.UserLoginResponse;
import com.dubber.dubbo.user.dto.UserLoginRequest;

public interface IUserService {

    /**
     * 登录
     * @param request
     * @return
     */
    UserLoginResponse login(UserLoginRequest request);
}
