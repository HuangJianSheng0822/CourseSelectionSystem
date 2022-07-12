package com.dao;

import com.pojo.Student;
import com.pojo.Teacher;
import com.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public List<Student> getStuList() throws SQLException {
        String sql="select * from student";
        ResultSet resultSet = DBUtil.executeQuery (sql);
        ArrayList<Student> objects = new ArrayList<> ();
        if (resultSet!=null){
            while (resultSet.next ()) {
                objects.add (new Student (resultSet.getString ("stuId"),resultSet.getString ("stuPwd"),resultSet.getString ("stuName"),
                        resultSet.getString ("stuSex"),resultSet.getString ("stuCardId"),resultSet.getString ("stuClass")
                ));
            }
        }
        return objects;
    }
    public int updateStu(Student student){
        String sql="UPDATE `student` SET `stuPwd`='"+student.getStuPwd ()+"', `stuName`='"+student.getStuName ()+"', `stuSex`='"+student.getStuSex ()+"'," +
                " `stuCardId`='"+student.getStuCardId ()+"', `stuClass`='"+student.getStuClass ()+"' WHERE (`stuId`='"+student.getStuId ()+"')";
        return DBUtil.executeUpdate (sql);
    }
    public int delStu(String stuId){
        String sql="DELETE FROM `student` WHERE (`stuId`='"+stuId+"')";
        return DBUtil.executeUpdate (sql);
    }
    public int addStu(Student student){
        String sql="INSERT INTO `student` (`stuId`, `stuPwd`, `stuName`, `stuSex`, `stuCardId`, `stuClass`) VALUES" +
                " ('"+student.getStuId ()+"', '"+student.getStuPwd ()+"', '"+student.getStuName ()+"', '"+student.getStuSex ()+"', " +
                "'"+student.getStuCardId ()+"', '"+student.getStuClass ()+"')";
        return DBUtil.executeUpdate (sql);
    }

    public Student getStu(String stuId) throws SQLException {
        Student student=null;
        String sql="select * from student where stuId = \""+stuId+"\"";
        ResultSet resultSet = DBUtil.executeQuery (sql);
        while (resultSet.next ()) {
            student=new Student (resultSet.getString ("stuId"),resultSet.getString ("stuPwd"),resultSet.getString ("stuName"),
                    resultSet.getString ("stuSex"),resultSet.getString ("stuCardId"),resultSet.getString ("stuClass"));
        }
        return student;
    }
}

