package cn.smbms.dao.impl;

import cn.smbms.beans.User;
import cn.smbms.dao.UserDao;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao {

    @Autowired
    private SqlSessionTemplate sqlSessionTemplate ;

    @Override
    public List<User> getUserList(User user) {
        return sqlSessionTemplate.selectList("cn.smbms.dao.UserDao.getUserList" , user ) ;
    }

    @Override
    public void addUser(User user) {
        sqlSessionTemplate.insert("cn.smbms.dao.UserDao.addUser" , user );
    }

    @Override
    public void deleteUserByCondition(User user) {
        sqlSessionTemplate.delete("cn.smbms.dao.UserDao.deleteUserByCondition" , user ) ;
    }

    @Override
    public void updateUser(User user) {
        sqlSessionTemplate.update("cn.smbms.dao.UserDao.updateUser" , user ) ;
    }


}
