<%-- 
    Document   : viewItems
    Created on : Nov 2, 2023, 1:46:47 AM
    Author     : Pubudu Kasun
--%>

<%@page import="DAO.StockDAO"%>
<%@page import="modal.Stock"%>
<%@page import="java.util.Base64"%>
<%@page import="java.io.File"%>
<%@page import="org.apache.commons.io.FileUtils"%>
<%@page import="modal.Item"%>
<%@page import="java.util.List"%>
<%@page import="DAO.ItemDAO"%>


<div class="row">
    <%
//        ItemDAO itemDAO = new ItemDAO();
//        List<Item> searchActiveItems = itemDAO.ItemsActiveItems();

        StockDAO stockDAO = new StockDAO();
        List<Stock> searchUpdatedItem = stockDAO.SearchUpdateTableItems();

        for (Stock seItem : searchUpdatedItem) {
            String imgPath = seItem.getItem().getImgurl().replace("\\", "/");
            byte[] fileContent = FileUtils.readFileToByteArray(new File(imgPath));
            String encodedString = Base64.getEncoder().encodeToString(fileContent);
            String imgBase64 = "data:image/jpeg;base64," + encodedString;


    %>


    <div class="col-sm-4">
        <div class="container d-flex justify-content-center">
            <figure class="card card-product-grid card-lg"> <a href="#" class="img-wrap" data-abc="true"><img src=" <%= imgBase64%> " ></a>
                <figcaption class="info-wrap">
                    <div class="row">
                        <div class="col-md-12"> <a href="#" class="title" data-abc="true"><small>Item ID : <%=seItem.getItem().getId()%></small>  </a> </div>
                        <div class="col-md-12 text-center" style="font-weight: bold;"> <a href="#" class="title" data-abc="true"> <%=seItem.getItem().getName()%> </a> </div>


                        <div class="col-md-12">
                            <div class="rating text-right"> <i class="fa fa-star"></i> <i class="fa fa-star"></i> <i class="fa fa-star"></i> </div>
                        </div>
                    </div>
                </figcaption>
                <div class="bottom-wrap"> <a href="AddToCart?item=<%=seItem.getId()%>" class="btn btn-primary float-right" data-abc="true"> Add to Cart </a>
                    <div class="price-wrap">
                

                        <span class="price h6">LKR. <%= seItem.getPrice()%></span> 
                        <div class="col-md-12"> <a class="title" data-abc="true"><small class="text-danger">Item Qty : <%=seItem.getQty()%></small>  </a> </div>
                        <br> <small><%= seItem.getDescription()%></small> 
                    </div>
                   

                </div>
            </figure>
        </div>
    </div>
    <%
        }

    %>
</div>
