package com.service.teacher;

import com.dao.CurriculumDao;
import com.dao.SelectionDao;
import com.dao.StudentDao;
import com.pojo.Selection;
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

public class GetSel extends HttpServlet {
    SelectionDao selectionDao=new SelectionDao ();
    CurriculumDao curriculumDao=new CurriculumDao ();
    StudentDao studentDao=new StudentDao ();
    @Override
    protected void doGet( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        List<String> stuIds=new ArrayList<> ();
        List<Student> students=new ArrayList<> ();
        try {
            stuIds = selectionDao.getSelection (curriculumDao.getCurId ((String) req.getSession ().getAttribute ("id")));
        } catch (SQLException e) {
            e.printStackTrace ();
        }
        for (int i = 0; i < stuIds.size (); i++) {
            try {
                students.add (studentDao.getStu (stuIds.get (i)));
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }

        resp.getWriter ().print (Json.setJson (students));
    }
}