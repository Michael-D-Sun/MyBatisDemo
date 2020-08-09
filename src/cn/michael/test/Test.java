package cn.michael.test;

import cn.michael.dao.UserDao;
import cn.michael.entity.User;
import cn.michael.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException{
        UserDao userDao = new UserDao();
        User user = new User();
        user.setId(3);
        user.setName("wangliu");
        user.setPwd("12344fadafd");
        userDao.updateUser(user);
    }

}
