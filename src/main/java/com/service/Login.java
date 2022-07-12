package com.service;

import com.dao.LoginDao;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class Login extends HttpServlet {
    LoginDao loginDao=new LoginDao ();
    @Override
    protected void doPost( HttpServletRequest req , HttpServletResponse resp ) throws ServletException, IOException {
        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json;charset=utf-8");
        String id = req.getParameter ("id");
        String pwd = req.getParameter ("pwd");
        String role = req.getParameter ("role");
        if (role.equals ("admin")){
            try {
                Object pwd1 = loginDao.adminLogin (id);
                if (pwd1!=null){
                    if (pwd.equals (pwd1)){
                        req.getSession ().setAttribute ("role","admin");
                        req.getSession ().setAttribute ("id",id);
                        ObjectMapper objectMapper = new ObjectMapper ();
                        resp.getWriter ().print (objectMapper.writeValueAsString ("admin"));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        if (role.equals ("tea")){
            try {
                Object pwd1 = loginDao.teaLogin (id);
                System.out.println (pwd1);
                if (pwd1!=null){
                    if (pwd.equals (pwd1)){
                        req.getSession ().setAttribute ("role","tea");
                        req.getSession ().setAttribute ("id",id);
                        ObjectMapper objectMapper = new ObjectMapper ();
                        resp.getWriter ().print (objectMapper.writeValueAsString ("teacher"));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
        if (role.equals ("stu")){
            try {
                Object pwd1 = loginDao.stuLogin (id);
                if (pwd1!=null){
                    if (pwd.equals (pwd1)){
                        req.getSession ().setAttribute ("role","stu");
                        req.getSession ().setAttribute ("id",id);
                        ObjectMapper objectMapper = new ObjectMapper ();
                        resp.getWriter ().print (objectMapper.writeValueAsString ("student"));
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace ();
            }
        }
    }
}
