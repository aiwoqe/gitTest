package cn.hengzhi.service;

import cn.hengzhi.entity.Account;
import cn.hengzhi.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("accountService")
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    /**
     * 查询所有账户信息
     * @return
     */
    public List<Account> findAll(){
        List<Account> account =accountMapper.findAll();
        return account;
    }

    /**
     * 保存账户信息
     * @param account
     */
    public Account saveAccount(Account account){
        System.out.println("业务层，保存账户");
        accountMapper.saveAccount(account);
        return account;
    }
}
