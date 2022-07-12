package com.service.student;

import com.dao.SelectionDao;
import com.pojo.Curriculum;
import com.pojo.Selection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddSel extends HttpServlet {
    SelectionDao selectionDao=new SelectionDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String curId=req.getParameter ("curId");
       selectionDao.addSelection (new Selection (curId,(String) req.getSession ().getAttribute ("id")));
    }
}

