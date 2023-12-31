/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.cart;

import DAO.ItemDAO;
import DAO.StockDAO;
import DAO.dto.SessionCart;
import DAO.dto.SessionCartItem;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modal.Item;
import modal.Stock;

/**
 *
 * @author Pubudu Kasun
 */
@WebServlet(name = "AddToCart", urlPatterns = {"/AddToCart"})
public class AddToCart extends HttpServlet {

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
            HttpSession session = request.getSession();
            if (session.getAttribute("UserData") == null) {
                SessionCart sessionCart = null;
                if (session.getAttribute("cart") == null) {
                    sessionCart = new SessionCart();
                } else {
                    sessionCart = (SessionCart) session.getAttribute("cart");
                }
                List<SessionCartItem> itemList = sessionCart.getItemList();
                String itemid = request.getParameter("item");

//                ItemDAO itemDAO = new ItemDAO();
//                Item item = itemDAO.search(itemid);

                StockDAO stockDAO = new StockDAO();
                Stock item = stockDAO.search(Integer.parseInt(itemid));
                SessionCartItem cartItem = new SessionCartItem();
                cartItem.setStockid(item.getId());
                cartItem.setItem(item.getItem());
                cartItem.setQty(1);
                cartItem.setUnitprice(item.getPrice());
                cartItem.setTotal(item.getPrice()*1);

                itemList.add(cartItem);

                session.setAttribute("cart", sessionCart);

            }
            response.sendRedirect("Home.jsp");
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
