/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.employee;

import DAO.EmployeeDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Employee;

/**
 *
 * @author Pubudu Kasun
 */
@WebServlet(name = "EmployeeSearch", urlPatterns = {"/EmployeeSearch"})
public class EmployeeSearch extends HttpServlet {

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

            EmployeeDAO employeeDAO = new EmployeeDAO();
            List<Employee> search = employeeDAO.search();
            

            String content = "";
            for (Employee employee : search) {
                content += "<tr>";
                content += "<td>" + employee.getId() + "</td>";
                content += "<td>" + employee.getEmployeeno() + "</td>";
                content += "<td>" + employee.getFirstname() + "</td>";
                content += "<td>" + employee.getLastname() + "</td>";
                content += "<td>" + employee.getMobileno() + "</td>";
                content += "<td>" + employee.getEmail() + "</td>";
                content += "<td>" + employee.getSalary() + "</td>";
                int usereid = employee.getId();

                if (employee.getLogins().isEmpty()) {
                      content += "<td><button type='button' onclick = 'load(`" + usereid + "`)' id='bname' class='bname btn btn-primary' data-toggle='modal' data-target='#exampleModal'  data-whatever='@getbootstrap'>Set Access</button></td>";
                } else {
                      content += "<td><button type='button' onclick = 'load(`" + usereid + "`)' id='bname' class='bname btn btn-success' data-toggle='modal' data-target='#exampleModal'  data-whatever='@getbootstrap'>Update User</button></td>";
                }
             
                content += "<td><button class='btn btn-danger'>Delete</button></td>";
                content += "<tr>";
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
