package com.service.admin;

import com.dao.CurriculumDao;
import com.dao.StudentDao;
import com.util.Json;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class GetCurriculum extends HttpServlet {
    CurriculumDao curriculumDao=new CurriculumDao ();
    @Override
    protected void doGet( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        try {
            resp.getWriter ().print (Json.setJson (curriculumDao.getCurList ()));
        } catch (SQLException e) {
            e.printStackTrace ();
        }
    }
}
