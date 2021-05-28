/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.RegistrasiDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.RegistrasiModel;

/**
 *
 * @author IQBAL NOTEBOOK
 */
public class RegistrasiServlet extends HttpServlet {

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nama = request.getParameter("nama");
        String email = request.getParameter("email");
        String password = request.getParameter("pass");
        String alamat = request.getParameter("alamat");
        
        RegistrasiModel regis = new RegistrasiModel(nama,email,password,alamat);
        
        request.setAttribute("data", regis );
         
        RegistrasiDAO dao = new RegistrasiDAO();
        dao.insertData(regis);
        
        RequestDispatcher dp = request.getRequestDispatcher("userlogin.jsp");
        dp.forward(request, response);
    }

    

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
