package cn.smbms.service.impl;

import cn.smbms.beans.User;
import cn.smbms.dao.UserDao;
import cn.smbms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao ;

    @Override
    public List<User> getUserListWithCondition(User user) {
        List<User> userList = userDao.getUserList(user);
        return userList ;
    }

    @Override
    @Transactional(propagation = Propagation.SUPPORTS , isolation = Isolation.DEFAULT )
    public void addUser(User user) {
        userDao.addUser( user );
    }

    @Override
    public void deleteUserByCondition(User user) {
        userDao.deleteUserByCondition(user) ;
    }

    @Override
    public void updateUser(User user) {
        userDao.updateUser(user) ;
    }

}
