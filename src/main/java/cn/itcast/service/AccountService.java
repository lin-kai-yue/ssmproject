package cn.itcast.service;

import cn.itcast.domain.Account;

import java.util.List;

public interface AccountService {

    // 查询所有账户
    public List<Account> findAll();

    // 根据用户名查询账户
    public Account findPassword(int name) throws Exception;

    // 根据用户名查询账户
    public Account findbyid(int id);

    // 保存帐户信息
    public void saveAccount(Account account);

}
