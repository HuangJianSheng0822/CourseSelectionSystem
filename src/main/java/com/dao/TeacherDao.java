package com.dao;

import com.pojo.Teacher;
import com.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TeacherDao {

    public List<Teacher> getTeaList() throws SQLException {
        String sql="select * from teacher";
        ResultSet resultSet = DBUtil.executeQuery (sql);
        ArrayList<Teacher> objects = new ArrayList<> ();
        if (resultSet!=null){
            while (resultSet.next ()) {
                objects.add (new Teacher (resultSet.getString ("teaId"),resultSet.getString ("teaPwd"),resultSet.getString ("teaName"),
                        resultSet.getString ("teaTitle"),resultSet.getString ("teaSex")
                ));
            }
        }
        return objects;
    }
    public int updateTea(Teacher teacher){
        String sql="UPDATE `teacher` SET `teaPwd`='"+teacher.getTeaPwd ()+"', `teaName`='"+teacher.getTeaName ()+"', " +
                "`teaTitle`='"+teacher.getTeaTitle ()+"', `teaSex`='"+teacher.getTeaSex ()+"' WHERE (`teaId`='"+teacher.getTeaId ()+"')";
        return DBUtil.executeUpdate (sql);
    }
    public int delTea(String teaId){
        String sql="DELETE FROM `teacher` WHERE (`teaId`='"+teaId+"')";
        return DBUtil.executeUpdate (sql);
    }
    public int addTea(Teacher teacher){
        String sql="INSERT INTO `teacher` (`teaId`, `teaPwd`, `teaName`, `teaTitle`, `teaSex`) " +
                "VALUES ('"+teacher.getTeaId ()+"', '"+teacher.getTeaPwd ()+"', '"+teacher.getTeaName ()+"', " +
                "'"+teacher.getTeaTitle ()+"', '"+teacher.getTeaSex ()+"')";
        return DBUtil.executeUpdate (sql);
    }
}

