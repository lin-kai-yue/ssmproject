package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 帐户dao接口
 */
@Repository
public interface AccountDao {

    // 查询所有账户
    @Select("select * from user")
    public List<Account> findAll();

    // 查询所有账户
    @Select("select * from user where name = #{name}")
    Account findByname(int name) throws Exception;

    // 查询所有账户
    @Select("select * from user where id = #{id}")
    Account findByid(int name);

    // 保存帐户信息
    @Insert("insert into user (name,password) values (#{name},#{password})")
    public void saveAccount(Account account);

}
