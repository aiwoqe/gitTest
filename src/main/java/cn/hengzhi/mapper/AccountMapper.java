package cn.hengzhi.mapper;

import cn.hengzhi.entity.Account;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ Author     ：MI
 * @ Date       ：Created in 23:51 2019/9/26
 * @ Description：账户Mapper接口
 */

@Repository
//它用于将数据访问层 (DAO 层 ) 的类标识为 Spring Bean。具体只需将该注解标注在 DAO类上即可。
// 同时，为了让 Spring 能够扫描类路径中的类并识别出 @Repository 注解，需要在 XML 配置文件中启用Bean 的自动扫描功能，这可以通过<context:component-scan/>实现。
public interface AccountMapper {
    //查询所有账户信息
    public List<Account> findAll();

    //保存账户信息
    public int saveAccount(Account account);
}
