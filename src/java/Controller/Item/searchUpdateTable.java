/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Item;

import DAO.StockDAO;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Base64;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modal.Item;
import modal.Stock;
import org.apache.commons.io.FileUtils;

/**
 *
 * @author Pubudu Kasun
 */
@WebServlet(name = "searchUpdateTable", urlPatterns = {"/searchUpdateTable"})
public class searchUpdateTable extends HttpServlet {

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

            StockDAO stockDAO = new StockDAO();
            List<Stock> SearchUpdateTable = stockDAO.SearchUpdateTableItems();

            String content = "";
            for (Stock stock : SearchUpdateTable) {
 
                String imgPath = stock.getItem().getImgurl().replace("\\", "/");
                byte[] fileContent = FileUtils.readFileToByteArray(new File(imgPath));
                String encodedString = Base64.getEncoder().encodeToString(fileContent);
                String imgBase64 = "data:image/jpeg;base64," + encodedString;
                content += "<tr>";

                content += "<td>" + stock.getId() + "</td>";
                content += "<td>" + stock.getItem().getId() + "</td>";
                content += "<td>" + stock.getItem().getName() + "</td>";

                content += "<td>" + stock.getPrice() + "</td>";
                content += "<td>" + stock.getQty() + "</td>";
                content += "<td>" + stock.getDescription() + "</td>";
                content += "<td>" + stock.getItem().getIsactive() + "</td>";
                content += "<td> <img alt=\"itemImage\" src=\'" + imgBase64 + "' height='50px' weight='50px'></td>";

                content += "<td><button type='button' onclick='stockUpdate(`" + stock.getId() + "`,`" + stock.getItem().getId() + "`,`" + stock.getItem().getName() + "`,`" + imgBase64 + "`,`" + stock.getPrice() + "`,`" + stock.getDescription() + "`,`"+stock.getQty()+"`)' id='bname' class='bname btn btn-primary' data-toggle='modal' data-target='#exampleModal2'  data-whatever='@getbootstrap'>Update Stock</button></td>";

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
