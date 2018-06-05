package com.dubber.dubbo.user;

import com.dubber.dubbo.user.dto.Response;

/**
 * Demo class
 *
 * @author dubber
 * @date 2018/6/5
 */
public interface IUserBalanceService {

    /**
     * 更新用户余额
     */
    public Response updateUserBalance();
}
