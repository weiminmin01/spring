package cn.smbms.service;

import cn.smbms.beans.User;

import java.util.List;

public interface UserService {
    //  有条件的查询所有用户
    public List<User> getUserListWithCondition(User user ) ;

    // 增加用户
    public void addUser (User user ) ;

    // 删除用户
    public void deleteUserByCondition( User user ) ;

    // 修改用户
    public void updateUser( User user ) ;

}
