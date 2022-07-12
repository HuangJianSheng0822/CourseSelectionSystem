package com.service.admin;

import com.dao.CurriculumDao;
import com.dao.StudentDao;
import com.pojo.Curriculum;
import com.pojo.Student;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddCur extends HttpServlet {
    CurriculumDao curriculumDao=new CurriculumDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String curId=req.getParameter ("curId");
        String curName= req.getParameter ("curName");
        String curBefore= req.getParameter ("curBefore");
        String curScore = req.getParameter ("curScore");
        String teaId= req.getParameter ("teaId");
        curriculumDao.addStu (new Curriculum (curId,curName,curBefore,curScore,teaId));
//        resp.sendRedirect (req.getContextPath()+"/index.jsp");
    }
}