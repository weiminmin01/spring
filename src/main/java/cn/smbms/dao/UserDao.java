package cn.smbms.dao;

import cn.smbms.beans.User;

import java.util.List;

public interface UserDao {

    public List<User> getUserList( User user ) ;


    void addUser(User user);

    void deleteUserByCondition(User user);

    void updateUser(User user);
}
