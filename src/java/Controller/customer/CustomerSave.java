/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.customer;

import DAO.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Customer;


/**
 *
 * @author Pubudu Kasun
 */
@WebServlet(name = "CustomerSave", urlPatterns = {"/CustomerSave"})
public class CustomerSave extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
           String cusid = request.getParameter("cusid1");
           String fname = request.getParameter("fname");
           String lname = request.getParameter("lname");
           String mail = request.getParameter("email");
           String uname = request.getParameter("uname");
           String pass1 = request.getParameter("pass1");
           String pass2 = request.getParameter("pass2");
           String stat = request.getParameter("stat");
           
           // System.out.println(cusid+" "+fname+" "+lname+" "+mail+" "+uname+" "+pass1+" "+pass2+" "+stat);
            Customer customer = new Customer();
            customer.setCode(cusid);
            customer.setFirstName(fname);
            customer.setLastName(lname);
            customer.setEmail(mail);
            customer.setUserName(uname);
            customer.setPassword(pass1);
            customer.setConfirmPassword(pass2);
           
            if (stat.equals("1")) {
                 customer.setIsactive(Boolean.TRUE);
            } else {
                customer.setIsactive(Boolean.FALSE);
            }
           CustomerDAO dAO = new CustomerDAO();
           dAO.Save(customer);
        }
    }

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
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
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
