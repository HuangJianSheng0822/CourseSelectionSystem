package com.service.admin;

import com.dao.StudentDao;
import com.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DelStu extends HttpServlet {
    StudentDao studentDao=new StudentDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String stuId=req.getParameter ("stuId");
        studentDao.delStu (stuId);
//        resp.sendRedirect (req.getContextPath()+"/index.jsp");
    }
}