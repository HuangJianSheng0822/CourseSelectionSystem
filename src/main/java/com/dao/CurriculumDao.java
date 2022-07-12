package com.dao;

import com.pojo.Curriculum;
import com.pojo.Student;
import com.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CurriculumDao {
    public List<Curriculum> getCurList() throws SQLException {
        String sql="select * from curriculum";
        ResultSet resultSet = DBUtil.executeQuery (sql);
        ArrayList<Curriculum> objects = new ArrayList<> ();
        if (resultSet!=null){
            while (resultSet.next ()) {
                objects.add (new Curriculum (resultSet.getString ("curId"),resultSet.getString ("curName"),resultSet.getString ("curBefore"),
                        resultSet.getString ("curScore"),resultSet.getString ("teaId")
                ));
            }
        }
        return objects;
    }
    public int updateCur(Curriculum curriculum){
        String sql="UPDATE `curriculum` SET `curName`='"+curriculum.getCurName ()+"', `curBefore`='"+curriculum.getCurBefore ()+"', `curScore`='"+curriculum.getCurScore ()+"'," +
                " `teaId`='"+curriculum.getTeaId ()+"'  WHERE (`curId`='"+curriculum.getCurId ()+"')";

        return DBUtil.executeUpdate (sql);
    }
    public int delCur(String curId){
        String sql="DELETE FROM `curriculum` WHERE (`curId`='"+curId+"')";
        return DBUtil.executeUpdate (sql);
    }
    public int addStu(Curriculum curriculum){
        String sql="INSERT INTO `curriculum` (`curId`, `curName`, `curBefore`, `curScore`, `teaId`)" +
                " VALUES ('"+curriculum.getCurId ()+"', '"+curriculum.getCurName ()+"', '"+curriculum.getCurBefore ()
                +"', '"+curriculum.getCurScore ()+"', '"+curriculum
                .getTeaId ()+"')";
        return DBUtil.executeUpdate (sql);
    }

    public String getCurId(String teaId) throws SQLException {
        String sql="select curId from curriculum where teaId=\""+teaId+"\"";
        ResultSet resultSet = DBUtil.executeQuery (sql);
        String curId=null;
        while (resultSet.next ()){
            curId=resultSet.getString ("curId");
        }
        return curId;
    }

    public ArrayList<Curriculum> getCurById(String curId) throws SQLException {
        ArrayList<Curriculum> objects = new ArrayList<> ();
        String sql="select * from curriculum where curId=\""+curId+"\"";
        ResultSet resultSet = DBUtil.executeQuery (sql);
        while (resultSet.next ()){
            objects.add (new Curriculum (resultSet.getString ("curId"),resultSet.getString ("curName"),resultSet.getString ("curBefore"),
                    resultSet.getString ("curScore"),resultSet.getString ("teaId")));
        }
        return objects;
    }
}
