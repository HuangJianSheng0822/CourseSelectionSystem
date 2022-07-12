package com.service.admin;

import com.dao.TeacherDao;
import com.util.Json;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class GetTeacher extends HttpServlet {
    TeacherDao teacherDao=new TeacherDao ();
    @Override
    protected void doGet( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        try {
            resp.getWriter ().print (Json.setJson (teacherDao.getTeaList ()));
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
}
