/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

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
@WebServlet(name = "CustomerSearch", urlPatterns = {"/CustomerSearch"})
public class CustomerSearch extends HttpServlet {

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
            String id = request.getParameter("cusid");
            CustomerDAO DAO = new CustomerDAO();
            Customer searchByID = DAO.seachByID(id);
            
            String content="";
            try {
                content ="<tr>\n"
                        + "<td>" + searchByID.getCode() + "</td>\n"
                        + "<td>" + searchByID.getFirstName() + "</td>\n"
                        + "<td>" + searchByID.getLastName() + "</td>\n"
                        + "<td>" + searchByID.getEmail() + "</td>\n"
                        + "<td>" + searchByID.getUserName() + "</td>\n"
                        + "<td>" + searchByID.getPassword() + "</td>\n"
                        + "<td>" + searchByID.isIsactive() + "</td>\n"
                        + "</tr>";
                
            } catch (org.hibernate.ObjectNotFoundException e) {
                
                     
                String alert = "<div class= 'alert alert-danger'>No Data Found</div>";
                out.print(alert);
            }
            out.println(content); 
            
            
               
          
           
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
