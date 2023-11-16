<%-- 
    Document   : Item
    Created on : Oct 29, 2023, 9:57:01 AM
    Author     : Pubudu Kasun
--%>

<%@page import="DAO.ItemDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Item Upload</title>

        <%@include file="MyResourceFile.jsp" %>

    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="col-sm-4 mt-3">
                    <form class="row g-3" action="ItemSave" enctype="multipart/form-data" method="post">
                        <div class="row">
                            <div class="col-sm-12  bg-light">
                                <h1>ADD NEW ITEM</h1>
                                <!--                        <div class="form-group mb-3">
                                                            <label class="form-label">Item ID</label>
                                                            <input class="form-control" type="text" name="itemId" id="itemId" placeholder="Item ID"/>
                                                        </div>-->
                                <%
                                    ItemDAO dAO = new ItemDAO();
                                    String itemSize = "I0" + (dAO.ItemsSearch().size() + 1);


                                %>

                                <div class="form-group  mb-3">
                                    <label class="form-label">Item Name & (Current Item ID: <%=itemSize%>)</label>
                                    <input class="form-control" type="text" name="itemName" id="itemName" placeholder="Item Name"/>
                                </div>
                                <div class="form-group mb-3">
                                    <label class="form-label">Select Image</label>
                                    <input type="file" class="form-control" id="file" name="file">
                                </div>

                                <div class="form-check mb-3">
                                    <input class="form-check-input" type="checkbox"  id="checkbox" name="checkbox" checked="">
                                    <label class="form-check-label" for="flexCheckDefault">Item Status</label>
                                </div>
                                <div class="form-group mb-3">
                                    <input type="submit" class="btb btn-primary form-control" id="saveItem" value="Upload">

                                </div>
                                    <div class="form-group mb-3">
                                        <input type="button" class="btb btn-warning form-control" id="viewItem" value="View Item">
                                    </div>
                            </div>
                        </div> 
                       
                    </form> 

                </div>
                <div class="col-sm-8"><%@include file="viewItems.jsp" %></div>
            </div>
        </div>
    </body>
    <script>

        $(document).ready(function () {
            $("#viewItem").click(function () {
                window.location.replace("stockUpdate.jsp");
            });
        });



//        $(document).ready(function (){
//            $("#saveItem").click(function (){
//                var itemId = $("#itemId").val();
//                var itemName = $("#itemName").val();
//                var imgFile = $("#file").val();
//                var checkbox = $("#checkbox").val();
//                
//                $.ajax({
//                    type: 'POST',
//                    url: "ItemSave",
//                    enctype:"multipart/form-data",
//                    data:{"itemId":itemId, "itemName":itemName, "checkbox":checkbox},
//                    success:function (data){
//                        
//                    },
//                    error:function (){
//                        
//                    }
//                });
//            });
//        });
    </script>




</html>
