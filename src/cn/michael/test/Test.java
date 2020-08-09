package cn.michael.test;

import cn.michael.dao.UserDao;
import cn.michael.entity.User;
import cn.michael.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException{
        SqlSession sqlSession = MyBatisUtil.getSession();
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> users = userDao.getAll();
        System.out.println(users);
    }

}
