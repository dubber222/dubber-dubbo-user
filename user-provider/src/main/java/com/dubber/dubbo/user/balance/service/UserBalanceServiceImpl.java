package com.dubber.dubbo.user.balance.service;

import com.dubber.dubbo.user.IUserBalanceService;
import com.dubber.dubbo.user.dto.Response;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Demo class
 *
 * @author dubber
 * @date 2018/6/5
 */

@Repository("userBalanceService")
public class UserBalanceServiceImpl implements IUserBalanceService {

    @Resource
    private JdbcTemplate userJdbcTemplate;

    /**
     * 更新用户余额
     *
     * @return
     */
    @Override
    public Response updateUserBalance() {
        Response response = new Response();
        userJdbcTemplate.execute("UPDATE `user` SET balance = balance + 1 WHERE id = 1");
        response.setCode("200");
        response.setMemo("更新user余额成功!!");
        System.out.println("updateUserBalance : " + response.toString());
        return response;
    }

}
