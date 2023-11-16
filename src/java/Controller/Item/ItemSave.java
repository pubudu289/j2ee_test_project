/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller.Item;

import DAO.ItemDAO;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import modal.Item;

/**
 *
 * @author Pubudu Kasun
 */
@WebServlet(name = "ItemSave", urlPatterns = {"/ItemSave"})
public class ItemSave extends HttpServlet {

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
        try (PrintWriter outx = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
          
            String itemName = request.getParameter("itemName");
            String check = request.getParameter("checkbox");
            
            
            ItemDAO itemDAO = new ItemDAO();
            List<Item> searchAll = itemDAO.ItemsSearch();
            String itemid = "I0"+(searchAll.size()+1);
            int sortkey = searchAll.size()+1;

            Item item = new Item();
            item.setId(itemid);
            item.setName(itemName);
            item.setIsactive((check.trim().equals("on") ? Boolean.TRUE : Boolean.FALSE));
            item.setSortkey(sortkey);

//           Enter the uploading file path
            String uploadPath = "C:\\Users\\Pubudu Kasun\\Desktop\\New folder";
            File file = new File(uploadPath);
            if (!file.exists()) {
                file.mkdirs();
            }
            Part part = request.getPart("file");
            String original = getFileName(part);

            //Extract the extention from the file name
            String extention = ".jpg";
            int index = original.lastIndexOf('.');
            if (index > 0) {
                extention = original.substring(index + 1);
            }
            String fileName = "ITEM" + itemid + "." + extention;
            String filePath = uploadPath + File.separator + fileName;


            try (OutputStream out = new FileOutputStream(new File(filePath));
                    InputStream in = part.getInputStream()) {
                int read;
                final byte[] bytes = new byte[1024];
                while ((read = in.read(bytes)) != -1) {
                    out.write(bytes, 0, read);
                }
                item.setImgurl(filePath);
                ItemDAO itemDAO1 = new ItemDAO();
                itemDAO1.saveItem(item);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
            response.sendRedirect("Item.jsp");
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

    private String getFileName(Part part) {
        for (String cd : part.getHeader("content-disposition").split(";")) {
            if (cd.trim().startsWith("filename")) {
                String fileName = cd.substring(cd.indexOf('=') + 1).trim().replace("\"", "");
                return fileName.substring(fileName.lastIndexOf('/') + 1).substring(fileName.lastIndexOf('\\') + 1); // MSIE fix.
            }
        }
        return null;

    }
}
