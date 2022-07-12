package com.service.admin;

import com.dao.StudentDao;
import com.dao.TeacherDao;
import com.pojo.Student;
import com.pojo.Teacher;
import com.util.Json;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class AddStu extends HttpServlet {
    StudentDao studentDao=new StudentDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String stuId=req.getParameter ("stuId");
        String stuPwd= req.getParameter ("stuPwd");
        String stuName= req.getParameter ("stuName");
        String stuSex = req.getParameter ("stuSex");
        String stuCardId= req.getParameter ("stuCardId");
        String stuClass= req.getParameter ("stuClass");
        studentDao.addStu (new Student (stuId,stuPwd,stuName,stuSex,stuCardId,stuClass));
//        resp.sendRedirect (req.getContextPath()+"/index.jsp");
    }
}