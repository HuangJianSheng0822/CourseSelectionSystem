package com.dao;

import com.pojo.Selection;
import com.util.DBUtil;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SelectionDao {
    public int addSelection( Selection selection ){
        return DBUtil.executeUpdate ("INSERT INTO `selection` (`curId`, `stuId`) VALUES ('"+selection.getCurId ()+"', '"+selection.getStuId ()+"')");
    }

    public List<String> getSelection( String curId ) throws SQLException {
        ArrayList<String> objects = new ArrayList<> ();
        ResultSet resultSet = DBUtil.executeQuery ("select * from selection where curId =\"" + curId + "\"");
        while (resultSet.next ()){
            String stuId = resultSet.getString ("stuId");
            objects.add (stuId);
        }
        return objects;
    }

}
