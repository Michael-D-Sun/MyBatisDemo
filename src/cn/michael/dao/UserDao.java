package cn.michael.dao;

import cn.michael.entity.User;
import cn.michael.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class UserDao {
    public User getById(int id) throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        User user = session.selectOne("cn.michael.entity.UserMapper.selectUser", id);
        session.close();

        return user;
    }

    public int addUser(User user) throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        int result = session.insert("cn.michael.entity.UserMapper.addUser",user);
        session.commit();
        session.close();

        return result;
    }

    public int deleteUserById(int id) throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        int result = session.delete("cn.michael.entity.UserMapper.deleteUser",id);
        session.commit();
        session.close();

        return result;
    }

    public int updateUser(User user) throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        int result = session.insert("cn.michael.entity.UserMapper.updateUser",user);
        session.commit();
        session.close();

        return result;
    }
}
