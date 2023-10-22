/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAO.CustomerDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
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
@WebServlet(name = "CustomersLoad", urlPatterns = {"/CustomersLoad"})
public class CustomersLoad extends HttpServlet {

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
            CustomerDAO customerDAO = new CustomerDAO();
            List<Customer> search = customerDAO.search();
            String content = "";
            for (Customer customer : search) {
                content += "<tr>";
                content += "<td>" + customer.getCode() + "</td>";
                content += "<td>" + customer.getFirstName() + "</td>";
                content += "<td>" + customer.getLastName() + "</td>";
                content += "<td>" + customer.getEmail() + "</td>";
                content += "<td>" + customer.getUserName() + "</td>";
                content += "<td>" + customer.getPassword() + "</td>";
                content += "<td>" + customer.isIsactive() + "</td>";
                content += "<td><button class='btn btn-primary'>Update</button></td>";
                content += "<td><button class='btn btn-danger'><a href='CustomerDelete?code=" + customer.getCode() + "'>Delete</a></button></td>";
                content += "</tr>";
            }
            out.print(content);
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
