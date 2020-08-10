package cn.michael.dao;

import cn.michael.entity.Teacher;
import cn.michael.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;

public class TeacherDao {
    public Teacher getTeacher(int id) throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        Teacher teacher = session.selectOne("cn.michael.entity.teacher.mapper.getTeacher", id);

        return teacher;
    }
}
