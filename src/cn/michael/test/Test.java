package cn.michael.test;

import cn.michael.dao.StudentDao;
import cn.michael.dao.TeacherDao;
import cn.michael.entity.Student;
import cn.michael.entity.Teacher;
import cn.michael.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.io.IOException;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException{
        TeacherDao teacherDao = new TeacherDao();
        Teacher teacher = teacherDao.getTeacher(3);
        System.out.println(teacher);
    }


}
