package cn.michael.test;

import cn.michael.dao.StudentMapper;
import cn.michael.entity.Student;
import cn.michael.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException{
        SqlSession session = MyBatisUtil.getSession();
        StudentMapper studentMapper = session.getMapper(StudentMapper.class);
        List<Student> students = studentMapper.getAll();
        System.out.println(students);
    }


}
