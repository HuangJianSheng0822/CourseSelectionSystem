package com.service.admin;

import com.dao.CurriculumDao;
import com.dao.StudentDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class DelCur extends HttpServlet {
    CurriculumDao curriculumDao=new CurriculumDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String curId=req.getParameter ("curId");
        curriculumDao.delCur (curId);
//        resp.sendRedirect (req.getContextPath()+"/index.jsp");
    }
}