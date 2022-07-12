package com.service.teacher;

import com.dao.CurriculumDao;
import com.dao.SelectionDao;
import com.dao.StudentDao;
import com.pojo.Curriculum;
import com.pojo.Student;
import com.util.Json;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GetTeaCur extends HttpServlet {
    SelectionDao selectionDao=new SelectionDao ();
    CurriculumDao curriculumDao=new CurriculumDao ();
    StudentDao studentDao=new StudentDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        ArrayList<Curriculum> curById=new ArrayList<> ();
        try {
            String curId = curriculumDao.getCurId ((String) req.getSession ().getAttribute ("id"));
            curById = curriculumDao.getCurById (curId);
        } catch (SQLException e) {
            e.printStackTrace ();
        }

        resp.getWriter ().print (Json.setJson (curById));
    }
}