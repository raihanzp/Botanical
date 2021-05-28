/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.PesananDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.PesananModel;

/**
 *
 * @author IQBAL NOTEBOOK
 */
public class PesananServlet extends HttpServlet {



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
        String alamat = request.getParameter("alamat");
        String jenisBibit = request.getParameter("bibit");
        int jlhBibit = Integer.parseInt(request.getParameter("stok"));
        int harga = Integer.parseInt(request.getParameter("harga"));
        int total = jlhBibit*harga;
        
        PesananModel pesanan = new PesananModel(nama, alamat, jenisBibit, jlhBibit, total);
        
        request.setAttribute("data", pesanan);
        
        PesananDAO dao = new PesananDAO();
        dao.insertData(pesanan);
        
        RequestDispatcher dp = request.getRequestDispatcher("checkout.jsp");
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
