package com.service.admin;

import com.dao.TeacherDao;
import com.pojo.Teacher;
import com.util.Json;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class UpdateTea extends HttpServlet {
    TeacherDao teacherDao=new TeacherDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String teaId = req.getParameter ("teaId");
        String teaPwd = req.getParameter ("teaPwd");
        String teaName = req.getParameter ("teaName");
        String teaTitle = req.getParameter ("teaTitle");
        String teaSex = req.getParameter ("teaSex");
        teacherDao.updateTea (new Teacher (teaId,teaPwd,teaName,teaTitle,teaSex));
//        resp.sendRedirect (req.getContextPath()+"/index.jsp");
    }
}