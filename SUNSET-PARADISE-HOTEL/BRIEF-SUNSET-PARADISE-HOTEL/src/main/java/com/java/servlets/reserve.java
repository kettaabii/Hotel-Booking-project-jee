package com.java.servlets;

import com.java.dao.RoomDAOImpl;

import java.io.*;
import java.sql.SQLException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/reserve")
public class reserve extends HttpServlet {
    private String message;

    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            this.getServletContext().getRequestDispatcher("/WEB-INF/reserve.jsp").forward(request, response);
        } catch (ServletException e) {
            throw new RuntimeException(e);
        }

    }
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RoomDAOImpl roomdao = new RoomDAOImpl();
        try {
            request.setAttribute("arrayRoom", roomdao.getDataRoom());
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        this.getServletContext().getRequestDispatcher("/WEB-INF/Room.jsp").forward(request, response);
    }
}