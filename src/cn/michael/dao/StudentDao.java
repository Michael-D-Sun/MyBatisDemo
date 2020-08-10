package cn.michael.dao;

import cn.michael.entity.Student;
import cn.michael.entity.Teacher;
import cn.michael.util.MyBatisUtil;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.mapping.FetchType;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class StudentDao {
    public List<Student> getAll() throws IOException {
        SqlSession session = MyBatisUtil.getSession();
        List<Student>  students = session.selectList("cn.michael.entity.student.mapper.getStudents");
        return students;
    }
}
