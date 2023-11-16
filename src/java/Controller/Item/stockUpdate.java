/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Item;

import DAO.ItemDAO;
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
@WebServlet(name = "stockUpdate", urlPatterns = {"/stockUpdate"})
public class stockUpdate extends HttpServlet {

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
            ItemDAO itemDAO = new ItemDAO();
            List<Item> SearchTableItems = itemDAO.SearchTableItems();

            String content = "";
            for (Item item : SearchTableItems) {
                String imgPath = item.getImgurl().replace("\\", "/");
                byte[] fileContent = FileUtils.readFileToByteArray(new File(imgPath));
                String encodedString = Base64.getEncoder().encodeToString(fileContent);
                String imgBase64 = "data:image/jpeg;base64," + encodedString;

                content += "<tr>";
                content += "<td>" + item.getId() + "</td>";
                content += "<td>" + item.getName() + "</td>";
                content += "<td>" + item.getIsactive() + "</td>";
                content += "<td> <img alt=\"itemImage\" src=\'" + imgBase64 + "' height='50px' weight='50px'></td>";

                if (item.getStocks().isEmpty()) {
                    content += "<td><button type='button' onclick='stockSave(`" + item.getId() + "`,`" + item.getName() + "`,`" + imgBase64 + "`)' id='bname' class='bname btn btn-primary' data-toggle='modal' data-target='#exampleModal'  data-whatever='@getbootstrap'>Add New</button></td>";
                } else {
                    content += "<td><button type='button' onclick='stockSave(`" + item.getId() + "`,`" + item.getName() + "`,`" + imgBase64 + "`)' id='bname' class='bname btn btn-success' data-toggle='modal' data-target='#exampleModal'  data-whatever='@getbootstrap'>Add New</button></td>";
                }

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
