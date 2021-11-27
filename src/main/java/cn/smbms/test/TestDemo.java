package cn.smbms.test;

import cn.smbms.beans.User;
import cn.smbms.service.UserService;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class TestDemo {
    public static final Logger log = Logger.getLogger(TestDemo.class);


    @Test
    public void test() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserService userService = (UserService) context.getBean("userService");
        List<User> userList = userService.getUserListWithCondition(new User());

        for ( User u : userList ) {
            log.info(u.toString());
        }
    }


    @Test
    public void testAddUser() throws ParseException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setUserCode("xiaohong");
        user.setUserName("小红");
        user.setUserPassword("123456");
        user.setGender(1);
        user.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse("2000-03-23"));
        user.setPhone("13311562647");
        userService.addUser(user);
    }


    @Test
    public void text01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setId(17);
        userService.deleteUserByCondition(user);
    }



    @Test
    public void text02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        UserService userService = (UserService) context.getBean("userService");
        User user = new User();
        user.setUserName("小张");
        user.setId(15);
        userService.updateUser(user);
    }

}
