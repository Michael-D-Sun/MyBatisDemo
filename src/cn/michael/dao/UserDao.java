package cn.michael.dao;

import cn.michael.entity.User;
import cn.michael.util.MyBatisUtil;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDao {

    public List<User> getPage(int currentIndex, int pageSize) throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("startIndex",(currentIndex-1)* pageSize);;
        map.put("pageSize", pageSize);
        List<User> page = session.selectList("cn.michael.entity.UserMapper.getPage", map);
        System.out.println(page);
        return page;
    }

    public List<User> paging(int currentIndex, int pageSize) throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        RowBounds rowBounds = new RowBounds(currentIndex-1, pageSize);
        List<User> page = session.selectList("cn.michael.entity.UserMapper.paging", null, rowBounds);
        System.out.println(page);
        return page;
    }

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
